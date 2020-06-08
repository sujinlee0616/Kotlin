/*
 	상속을 내리는 클래스 ==> open class
        상속을 받아서 함수를 재정의 ==> 상속 내린 클래스 open fun ~~ 해야 
 */

open class Saram{
	// 멤버변수 선언
	// - 멤버변수는 파란색 밑줄 쳐진다. 
	var name:String="";
	var gender:String="";
	var addr:String="";
	
	open fun myData(){
		println("Saram:myData() Call")
	}
	fun myData2(){ // open 없음 ==> 재정의 불가 (override 불가)
		println("Saram:myData() Call")
	}
}
class Member:Saram() // 상속 
{
	fun dataPrint()
	{
		name="홍길동"
		gender="남자"
		addr="서울"
	}
	
	override fun myData()
	{
		println("Member:myData() Call...")
	}
		
	/*override fun myData2() // Error
	{
		println("Member:myData() Call...")
	}*/
}

fun main(args:Array<String>){
	var mem:Member=Member(); // 객체 생성 
	mem.dataPrint()
	println("mem.name="+mem.name)
	println("mem.gender="+mem.gender)
	println("mem.addr="+mem.addr)
	mem.myData()
}







