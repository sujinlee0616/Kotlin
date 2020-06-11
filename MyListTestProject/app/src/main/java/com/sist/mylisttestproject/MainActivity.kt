package com.sist.mylisttestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {
    var arraList_items: ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "http://211.238.142.181:3355/info"
        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        client.newCall(request).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {
                TODO("Not yet implemented")

            }

            override fun onResponse(call: Call, response: Response) {
                var str_response = response.body()!!.string()

                //이부분은 좀더 간편한 Gson 라이브러리를 사용하면 좋겠다.
                //create json object
                val jsonobj: JSONObject = JSONObject(str_response)
                //create json array
                var json_array: JSONArray = jsonobj.getJSONArray("info")
                var i : Int = 0
                var size: Int = json_array.length()

                arraList_items = ArrayList()
                for (i in 0.. size-1){
                    var json_objdetail: JSONObject = json_array.getJSONObject(i)
                    var user: User = User(
                        json_objdetail.getString("id"),
                        json_objdetail.getString("name"),
                        json_objdetail.getString("email")
                    )
                    arraList_items.add(user)

                }

                //Update Main UI
                runOnUiThread{
                    //listView adtapter
                    val obj_adtater: CustomAdapter
                    obj_adtater = CustomAdapter(applicationContext, arraList_items)
                    listView.adapter = obj_adtater
                }
            }
        })


    }

    //Data model
    data class User(var name: String, var id: String, var email: String)
}