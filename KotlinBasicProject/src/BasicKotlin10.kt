// Ŭ����: ���� ���, interface: ���� ���
interface A{
	fun a()
}
interface B{
	fun b()
}
open class C{ // open class ==> ���� �� Ŭ������ ��ӹ��� �� �ִ� 
	open fun c(){ // open fun ==> ���� �� �Լ��� overriding �� �� �ִ� 
		println("C:c() Call....")
	}
}
open class D{ // open class ==> ���� �� Ŭ������ ��ӹ��� �� �ִ�.
	fun d(){ // open�� ���� ==> class D�� ��ӹ��� �� ������, fun d�� overriding �� �� ����.
		println("D:d() Call....")
	}
}
/*class E:C(),D(){ // Error. Java ����̹Ƿ� ��Ŭ������ '���� ���'�� ����!!��
	
}*/

class E:C(),A,B{ // ��interface�� '���� ���' ����!!��
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









