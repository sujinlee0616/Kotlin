/*
 	����� ������ Ŭ���� ==> open class
        ����� �޾Ƽ� �Լ��� ������ ==> ��� ���� Ŭ���� open fun ~~ �ؾ� 
 */

open class Saram{
	// ������� ����
	// - ��������� �Ķ��� ���� ������. 
	var name:String="";
	var gender:String="";
	var addr:String="";
	
	open fun myData(){
		println("Saram:myData() Call")
	}
	fun myData2(){ // open ���� ==> ������ �Ұ� (override �Ұ�)
		println("Saram:myData() Call")
	}
}
class Member:Saram() // ��� 
{
	fun dataPrint()
	{
		name="ȫ�浿"
		gender="����"
		addr="����"
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
	var mem:Member=Member(); // ��ü ���� 
	mem.dataPrint()
	println("mem.name="+mem.name)
	println("mem.gender="+mem.gender)
	println("mem.addr="+mem.addr)
	mem.myData()
}







