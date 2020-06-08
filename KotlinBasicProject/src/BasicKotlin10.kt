// 클래스: 단일 상속, interface: 다중 상속
interface A{
	fun a()
}
interface B{
	fun b()
}
open class C{ // open class ==> 이제 이 클래스를 상속받을 수 있다 
	open fun c(){ // open fun ==> 이제 이 함수는 overriding 할 수 있다 
		println("C:c() Call....")
	}
}
open class D{ // open class ==> 이제 이 클래스를 상속받을 수 있다.
	fun d(){ // open이 없음 ==> class D를 상속받을 순 있지만, fun d를 overriding 할 순 없다.
		println("D:d() Call....")
	}
}
/*class E:C(),D(){ // Error. Java 기반이므로 ★클래스는 '단일 상속'만 가능!!★
	
}*/

class E:C(),A,B{ // ★interface는 '다중 상속' 가능!!★
	override fun c() {
		println("E:c() Call...")
	}

	override fun a() {
		println("E:a() Call...")
	}

	override fun b() {
		println("E:b() Call...")
	}	
}

fun main(args:Array<String>)
{
	var e=E()
	e.c()
	e.a()
	e.b()
}









