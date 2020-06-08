interface Runable{
	// 인터페이스에서 구현하지 않는 함수. 
	fun run();
	// 디폴트 함수 - 인터페이스에서 구현을 할 수 있는 함수.
	// 공통으로 적용되지 않는 부분은 디폴트 함수로 만들 수 있다 ==> 필요한 클래스에서만 구현 가능할 수 있게
	fun test(){
		println("Runable test() Call...")
	}
}

class Human:Runable{
	override fun run(){
		println("Human:run() Call...")
	}
}

class Human2:Runable{
	override fun run(){
		println("Human2:run() Call...")
	}
}

fun main(args:Array<String>)
{
	var h=Human();
	h.run()
	h.test()
}


