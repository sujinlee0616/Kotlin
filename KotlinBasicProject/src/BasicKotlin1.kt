// 2020.06.08 (월) - Kotlin 기본 문법  
/*
 1. Kotlin에서 사용하는 데이터형
   1) 숫자형
    (1) 정수
        Byte   (1byte=8bit) 
        Short  (2byte=16bit)
        Int    (4byte=32bit)
        Long   (8byte=64bit)
    (2) 실수형
        Double (8byte=64bit)
        Float  (4byte=32bit)
   2) 문자형
    (1) 문자: Char ==> ''
    (2) 문자열: String ==> ""
   3) 논리형
    (1) Boolean: true/false 

 2. 변수설정
   1) 상수: val
   2) 변수: var
	   ex) Java                           ex) Kotlin
	       int a=10;         <== 대응 ==>       var a=10  또는  var a:Int=10  
	       final int b=20;   <== 대응 ==>       val b:Int=20  또는  val b=20
	   ex2) Kotlin
	   		- Kotiln은 JetBrain에서 만들었음. 얘네는 프론트 많이 만들었던 회사라서, javascript의 영향을 많이 받았음.
	          ==> var, val : 자동 변환 변수 
	        var a=10.5
	        var b=false
   3) 배열 ★★★
	   ex) Java                                     ex) Kotlin
	       String[] names={"","",""};   <== 대응 ==>      val numbers:Array<Int>=arrayOf(1,2,3,4,5)
	 													 => numbers[0]....
   
 3. 연산자
    1) 산술연산자(+,-,*,/,%)
    2) 논리연산자(&&,||)
    3) 대입연산자(=)
    4) 비교연산자(==,!=,<,>,<=,>=)
 
 4. 제어문 
 5. 함수 
 6. 클래스 
 7. 인터페이스
 */

// 5. 함수
// Java: public static void main(String[] args)
fun main(args:Array<String>)
{
	val a:Int=100
	var b=200
	var c:Int
	c=300;
	println("a=$a,b=$b,c=$c") // $a: 변수 a의 값
	
	var s:String="Hello Kotlin"
	var cc='A'
	var d=10.5
	var bb=true
	var f:Float=10.5f
	println("cc=$cc,s=$s,d=$d,bb=$bb,f=$f")
}












 		