// when (Java������ switch~case��)
fun main(args:Array<String>)
{
	/*var gender=3;
	var s=genderCheck(gender)
	println("s=$s")*/
	var i=8;
	numberSelect(i)
	println("i=$i")
}

fun genderCheck(gender:Int):String
{
	var s:String=""
	when(gender)
	{
		1->s="����"
		2->s="����"
		3->s="����"
		4->s="����"
	}
	return s
}


fun numberSelect(a:Int)
{
	when (a){
		1->println("1�� �����߽��ϴ� :)")
		2,3->println("2,3�� �����߽��ϴ� :)")
		in 4..7->println("4~7���� �����߽��ϴ� :)")
		// 4,5,6,7 ==> 4..7 �� �� �� ����.
		8,9->println("8,9�� �����߽��ϴ� :)")
		!in 1..7->println("8,9�� ���õǾ����ϴ� :)")
	}
	
	
}









