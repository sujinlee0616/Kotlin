package com.sist.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
/*
      1) 변수
           val : 상수형 변수 (final)
           var : 변수 => 변경이 가능한 상태
                 => 자동 지정변수
           var a:String
           var b:Int
           var c:Array<String>
           ====> 간결성
           var a=""  ==> a:String
           var b=10  ==> b:Int
           var c=arrayOf("","","")  ==> c:Array<String>
      2) 제어문
           if() ~  if~else ~ if~else if ~else if ~ else
           while(조건) , do~while
           switch~case
             ==> when(no){
                   1->
                   2->
                   3->
                   else->
                 }
           for
             ==> for(i in 1..9 step 1)
                 for(i in 1..9 step 2)
                 for(i in 1..until(9))
                 for(item in list)
      3) 연산자
            ==> 산술연산자 ( +,-,*,/,%)
            ==> 비교연산자 ( == , != , < , > , <= , >=)
                ***** 문자열비교 ==> (==)
            ==> 논리 연산자 ( && , || )
            ==> 단항연산자 ( ++ ,-- )
            ==> 대입 ( = )
            var a=10;
            a++
            println("a=$a)

            val a=10;
            a++;
            println("a=$a) error

            final int a=100;
            a=200; error
      4) 함수 : ===> 반복을 제거 , 재사용 , 한가지 기능만 수행
         메소드
         fun 함수명(매개변수....) ==> (a:Int,b:String)
         {
         }
         fun 함수명(매개변수....):Int ==> (a:Int,b:String)
         {
         }
      5) 클래스 : 상속,인터페이스
         상속 내리는 클래스
         open class A
         상속을 받는 클래스
         class B:A()
           ==> 오버라이딩 ==> open fun

           ==> data class A(var a:Int);  ==> VO
      6) 안드로이드 라이브러리
      7) 화면 디자인
 */
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // 데이터를 받는다
        val height=intent.getStringExtra("height").toInt();
        // 전송 ==> 문자열 ==> 전송을 받은 다음에는 원하는 데이터형 변환
        val weight=intent.getStringExtra("weight").toInt();

        val result=weight/Math.pow(height/100.0,2.0);

        when{
            result>=35 -> resultTextView.text="고도비만"
            result>=30 -> resultTextView.text="2단계비만"
            result>=25 -> resultTextView.text="1단계비만"
            result>=20 -> resultTextView.text="과체중"
            result>=18.5 -> resultTextView.text="정상"
            else -> resultTextView.text="저체중"
        }

        Toast.makeText(this,"height:$height,weight:$weight,결과:$result",Toast.LENGTH_LONG).show()

    }
}