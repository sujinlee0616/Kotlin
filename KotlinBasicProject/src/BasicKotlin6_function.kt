import java.util.*
// Kotlin: Java�� ���̺귯���� �ʿ��� ��, ���� ���� ��� ���� ==> Math.random() ��
// ==> �� �𸣴°� �� Java���� �������ȴ�! :) 
// ����ȯ : toDouble(), toString()

/*  <Kotlin ������ �Լ�>
 	1. �������� �ִ� ���
       fun �Լ���(�Ű�����):��������{...} ==> �������� ':'���� ��������.
 	2. �������� ���� ���
       fun �Լ��� (�Ű�����){...} ==> void  */

fun main(args:Array<String>){

	var temp=(Math.random()*100)+1
	var com=temp.toInt() // ����ȯ
	println("com=$com")
	
	var scan=Scanner(System.`in`)
	while(true){
		println("1~100������ ������ �Է����ּ���.")
		var i=scan.nextInt()
		if(i<0 || i>100){
			println("1~100������ ������ �Է����ּ���. :( ")
			continue
		}
		if(i<com){
			println("�Է°����� ū ���� �Է��ϼ���.")
		}
		else if(i>com){
			println("�Է°����� ���� ���� �Է��ϼ���.")
		}
		else{
			println("Game Over!!")
			break
		}
	}
}







