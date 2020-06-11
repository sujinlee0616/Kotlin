package com.sist.lastapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import org.json.JSONObject
import java.net.URL

class CateFoodActivity : AppCompatActivity() {
    var dataList = ArrayList<HashMap<String, String>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cate_food)
        val cateno=intent.getStringExtra("cateno")
        val title=intent.getStringExtra("title")
        val subject=intent.getStringExtra("subject")
        val titleTextView=findViewById<TextView>(R.id.cate_titleView)
        titleTextView.text=title
        val subjectTextView=findViewById<TextView>(R.id.cate_subjectTextView)
        subjectTextView.text=subject
        fetchJsonData().execute(cateno)
    }
    inner class fetchJsonData() : AsyncTask<String, Void, String>() {
        override fun onPreExecute() {
            super.onPreExecute()

        }
        // String...
        override fun doInBackground(vararg params: String?): String? {
            //println(parmas[0])
            return URL("http://211.238.142.181:3355/cate_food2?cno="+params[0]).readText(
                Charsets.UTF_8
            )
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            val jsonObj = JSONObject(result)
            // {"category":[{},{},{}]}
            val usersArr = jsonObj.getJSONArray("cate_food")
            for (i in 0 until usersArr.length()) {
                val singleUser = usersArr.getJSONObject(i)

                val map = HashMap<String, String>()
                map["title"] = singleUser.getString("title")
                map["address"] = singleUser.getString("address")
                var img:String=singleUser.getString("image")
                img=img.substring(0,img.indexOf("^"))

                map["image"] = img
                map["tel"]=singleUser.getString("tel")
                dataList.add(map)
            }
            val cateListView=findViewById<ListView>(R.id.cate_ListView)
            cateListView.adapter = CateFoodAdapter(this@CateFoodActivity, dataList)
        }
    }
}