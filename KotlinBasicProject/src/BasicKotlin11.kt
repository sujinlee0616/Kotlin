class AA{
	val a:String="" // �ʱⰪ ���
	val b:String?=null // ��ü �ʱ�ȭ �� null�� �̷������� �ش�. 
	val c:BB?=null
}
class BB{
	
}


fun main(args:Array<String>){
	val foods:List<String> = listOf("���","��","����")
	for(f in foods){
		println(f)
	}
	println("===========================")
	
	val foods2=mutableListOf("��","����","���") // �ڿ� �������� ���� ����. (�ֳĸ� �������� �ڵ����� �������ִϱ�!)
	foods2.add("��")
	foods2.removeAt(0)
	foods2[1]="����"
	for(f in foods2){
		println(f)
	}
}


 
 
 
 
 
 
 
 
 
 