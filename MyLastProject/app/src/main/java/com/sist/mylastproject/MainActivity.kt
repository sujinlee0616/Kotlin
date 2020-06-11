package com.sist.mylastproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Member(val image:String)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}