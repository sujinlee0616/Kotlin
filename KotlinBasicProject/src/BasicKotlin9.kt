interface Runable{
	// �������̽����� �������� �ʴ� �Լ�. 
	fun run();
	// ����Ʈ �Լ� - �������̽����� ������ �� �� �ִ� �Լ�.
	// �������� ������� �ʴ� �κ��� ����Ʈ �Լ��� ���� �� �ִ� ==> �ʿ��� Ŭ���������� ���� ������ �� �ְ�
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


