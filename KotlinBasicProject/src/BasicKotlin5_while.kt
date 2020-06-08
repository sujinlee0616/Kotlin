import java.util.*;

fun main(args:Array<String>)
{
	/*whileTest1()*/
	/*whileTest2()*/
	doWhileTest()
}

fun whileTest1()
{
	var i=1;
	while(i<=10){
		println("i=$i")
		i++
	}
}

fun whileTest2()
{
	var scan=Scanner(System.`in`) // ESC 밑에 ` 
	println("정수 입력:")
	var j=scan.nextInt() // 값 입력 받는다 
	var i=1;
	while(i<=9){
		println("$j * $i = "+(i*j)) // $i*j 는 불가... 
		i++
	}
}

fun doWhileTest()
{
	var i=1;
	do{
		println("i=$i")
		i++
	}while(i<=10)
	
}












