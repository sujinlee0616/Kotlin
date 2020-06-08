fun main(args:Array<String>)
{
	println("==== forTest1 ====")
	forTest1()
	println("==== forTest2 ====")
	forTest2()
	println("==== forTest3 ====")
	forTest3()
	println("==== forTest4 ====")
	forTest4()
	println("==== forTest5 ====")
	forTest5()
}


// for��
fun forTest1()
{
	for(i in 1..10) // 1~10 
		println("i=$i")
}

fun forTest2()
{
	for(i in 1 until(10)) // 1~9
		println("i=$i")
}

fun forTest3()
{
	for(i in 1..10 step 2)
		println("i=$i")
}

fun forTest4()
{
	/*for(i in 10..1)  // Error. for(i in a..b)���� �ݵ�� a<b����.
		println("i=$i")*/
	for(i in 10 downTo(1))
		println("i=$i")
}

// forEach ==> Array
fun forTest5()
{
	var names=arrayOf("�عٶ��","���","�Ȱ���","ƫ��","���ƽŽ�")	 // �迭
	for(item in names)
	{
		println(item)
	}
}








