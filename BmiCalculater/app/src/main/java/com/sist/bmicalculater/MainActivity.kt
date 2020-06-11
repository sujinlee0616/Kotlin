package com.sist.bmicalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("데이터 읽기")
        val url="http://211.238.142.181:3355/category"
        var request=Request.Builder().url(url).build()
        val client=OkHttpClient();
        client.newCall(request).enqueue(object:Callback{
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                println(response.message())
            }

        })

    }
}