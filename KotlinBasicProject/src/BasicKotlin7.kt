/*
      ������ ���(function) ==> ��ü���� ���(class)
    
   1. Ŭ���� ����
    1) �Ű������� ���� ���
       ex) Java���� �ڵ��� ��� 
	       public class A
	       {
				// public A(){}  // <== Java������ �����ڰ� ������ ���� �� �����, �� �˾Ƽ� �������
	       }
 		   A a=new A();  // <== �׷��� �̷��� �ٷ� �� �� �ִ°ſ���. 
       ex) Kotlin ���� �ڵ��� ���
 		   class A
 		   {
		   }
 		   val a=A()
      - Java�� ��ü ���� �ÿ� new�� ����ϴ� �Ͱ� �޸�, Kotlin�� new�� ������� �ʴ´�.
        ex) Java:     List<String> list=new ArrayList<String>
        ex) Kotlin:   var list=ArrayList<String>()
    2) �Ű������� ����
             ���1)
		  	class A(var name:String)
		    var a=A("")
             ���2) 
	        class A
	        {
				constructor(name:String)
		 		{
				}
		    }
 
   2. ��ü ����
 	  var a=A("")
 
   3. ��������� �ʱ�ȭ
   - Java������ �ڵ�) 
	 	public class Sawon
		{
			private String name;
	 		private String dept;
	 		private String job;
	 		public Sawon(String name,String dept,String job)
	 		{
				this.name=name;
	 			this.dept=dept;
	 			this.job=job
			}
	 		=> getter/setter
		}
    - Kotlin������ �ڵ�) javascript�� ��� 
	 	class Sawon(var name:String,var dept:String, var Job:String)
	 	{
		
		}
	 	var s:Sawon("ȫ�浿","���ߺ�","���")
	 	s.name="��û��";
	 	s.dept="";
	 	s.job="";

   	  1) ����������
 	 	 public : ��� Ŭ������ ������ ����(���� ����)
  		        - �� Java������ default�� ������ �����ߴµ�, Kotlin������ public�� ���� ����.
           var a:String=""         
 		 private : �ڽ��� Ŭ���������� ��� ���� 
         protected : ��� ���� Ŭ�������� ��� ���� 
         internal : ���� ��� �ȿ� �����ϴ� ��� Ŭ�������� ��� ���� ==> default
 
   4. VO ����� ���
 
   5. �������̵�, ���
 
 
*/		
		
class Sawon{
	constructor(name:String,dept:String,job:String) // ������������
	{
		println("�̸�:"+name)
		println("�μ�:$dept")
		println("����:$job")
	}
}

class Sawon2(var name:String,var dept:String,var job:String){ // �ڸ��������
	
}

class Sawon3{ // ���������� ��� ���� 
	var name:String="" // ��� public�� ������ ��.
	var dept:String=""
	var job:String=""
}

fun main(args:Array<String>){ // main�� Ŭ���� ������ ��������... 
	var sa=Sawon("ȫ�浿","���ߺ�","���")
	//println("�̸�:"+sa.name) // Error
	println("=============================")
	
	var sa2=Sawon2("��û��","���ߺ�","����")
	println("�̸�:"+sa2.name)
	println("�μ�:"+sa2.dept)
	println("����:"+sa2.job)
	println("=============================")
	
	var sa3=Sawon3()
	sa3.name="������"
	sa3.dept="���ߺ�"
	sa3.job="�븮"
	println("�̸�:"+sa3.name)
	println("�μ�:"+sa3.dept)
	println("����:"+sa3.job)
	
}















		
		
		