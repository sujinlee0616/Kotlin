// when (Java에서의 switch~case문)
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
		1->s="남자"
		2->s="여자"
		3->s="남자"
		4->s="여자"
	}
	return s
}


fun numberSelect(a:Int)
{
	when (a){
		1->println("1을 선택했습니다 :)")
		2,3->println("2,3을 선택했습니다 :)")
		in 4..7->println("4~7까지 선택했습니다 :)")
		// 4,5,6,7 ==> 4..7 로 쓸 수 있음.
		8,9->println("8,9를 선택했습니다 :)")
		!in 1..7->println("8,9가 선택되었습니다 :)")
	}
	
	
}









