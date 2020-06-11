package com.sist.mykotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
/*
     데이터 관리 ==> 데이터 출력
     1) 다른 화면에 데이터를 전송?
        ?변수=값
        ?변수=값&변수=값
     2) 자바 => 메소드의 매개변수
        class A
        {
           public void disp()
           {
               B b=new B();
               b.disp(100,200)
           }
        }

        class B
        {
           public void disp(int a, int b)
           {
           }
        }

      3) 안드로이드
         intent.putExtra("height",heightEditText.text.toString())
         intent.putExtra("weight",weightEditText.text.toString())

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultButton.setOnClickListener{
            // 화면 이동 ==> Intent    result.do?height=111&weight=111
            val intent=Intent(this,ResultActivity::class.java)
            // 데이터 전송
            intent.putExtra("height",heightEditText.text.toString())
            intent.putExtra("weight",weightEditText.text.toString())
            startActivity(intent)
        }
    }
}