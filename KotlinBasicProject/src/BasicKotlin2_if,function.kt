/*
   <코틀린의 특성>
   1. 정적 타입 지정 언어
    - 데이터형 없이 선언하면 알아서 데이터 타입 설정됨.
      ex) var a:Int, var a=10
   2. 간결성, 실용성, 안전성
    - Java JVM 기반 ==> Java가 있으면 Kotlin 작성 가능
   3. 상호운영성 
    - ex) import java.util.*  이런식으로 Java 라이브러리를 그대로 갖고 와서 사용할 수 있다.  
*/

// 4.제어문 - if, when(Java에서의 switch~case문), for, while

// ex) 
	fun main(args:Array<String>)
	{
		/*var a=10
		var b=20
		var c=max(a,b)
		println("max=$c")
		var d=30
		var e=50
		var k=max1(d,e)
		println("max=$k")*/
		
		var score=85;
		var jumsu=hakjum(score)
		println("score=$score, jumsu=$jumsu 학점")
	}

    // 함수 만드는 방법1) 
	// fun 함수명(매개변수...)            ===> void 함수명(매개변수)       ===> (X). Error. 
	// fun 함수명(매개변수...):return형       ===> return형 함수명(매개변수)    ===> (O).
	fun max(a:Int,b:Int):Int
	{
		var c:Int
		if(a>b)
			c=a
		else
			c=b
		return c
	}

	// 함수 만드는 방법2) 
	fun max1(a:Int,b:Int):Int=if(a>b) a else b

	// 함수 만드는 방법3) 함수를 변수같이 만듦.   
	fun max2(a:Int,b:Int)=if(a>b) a else b
	

/*
   <if 조건문>
   if(조건)
   if(조건) ~ else
   if(조건) ~ else if(조건) ~ else 
 */

fun hakjum(a:Int):Char
{
	var c:Char='A'
	if(a>=90)
		c='A'
	else if(a>=80)
		c='B'
	else if(a>=70)
		c='C'
	else if(a>=60)
		c='D'
	else
		c='F'
	return c
}











