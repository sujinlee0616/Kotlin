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
	var scan=Scanner(System.`in`) // ESC �ؿ� ` 
	println("���� �Է�:")
	var j=scan.nextInt() // �� �Է� �޴´� 
	var i=1;
	while(i<=9){
		println("$j * $i = "+(i*j)) // $i*j �� �Ұ�... 
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












