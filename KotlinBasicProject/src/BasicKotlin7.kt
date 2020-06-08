/*
      절차적 언어(function) ==> 객체지향 언어(class)
    
   1. 클래스 선언
    1) 매개변수가 없는 경우
       ex) Java에서 코딩할 경우 
	       public class A
	       {
				// public A(){}  // <== Java에서는 개발자가 생성자 따로 안 만들면, 걍 알아서 만들어줌
	       }
 		   A a=new A();  // <== 그래서 이런거 바로 쓸 수 있는거였음. 
       ex) Kotlin 에서 코딩할 경우
 		   class A
 		   {
		   }
 		   val a=A()
      - Java는 객체 생성 시에 new를 사용하는 것과 달리, Kotlin은 new를 사용하지 않는다.
        ex) Java:     List<String> list=new ArrayList<String>
        ex) Kotlin:   var list=ArrayList<String>()
    2) 매개변수가 존재
             방식1)
		  	class A(var name:String)
		    var a=A("")
             방식2) 
	        class A
	        {
				constructor(name:String)
		 		{
				}
		    }
 
   2. 객체 생성
 	  var a=A("")
 
   3. 멤버변수의 초기화
   - Java에서의 코딩) 
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
    - Kotlin에서의 코딩) javascript랑 비슷 
	 	class Sawon(var name:String,var dept:String, var Job:String)
	 	{
		
		}
	 	var s:Sawon("홍길동","개발부","사원")
	 	s.name="심청이";
	 	s.dept="";
	 	s.job="";

   	  1) 접근지정어
 	 	 public : 모든 클래스에 접근이 가능(생략 가능)
  		        - ※ Java에서는 default가 생략이 가능했는데, Kotlin에서는 public이 생략 가능.
           var a:String=""         
 		 private : 자신의 클래스에서만 사용 가능 
         protected : 상속 받은 클래스까지 사용 가능 
         internal : 같은 모듈 안에 존재하는 모든 클래스에서 사용 가능 ==> default
 
   4. VO 만드는 방법
 
   5. 오버라이딩, 상속
 
 
*/		
		
class Sawon{
	constructor(name:String,dept:String,job:String) // ★지역변수★
	{
		println("이름:"+name)
		println("부서:$dept")
		println("직위:$job")
	}
}

class Sawon2(var name:String,var dept:String,var job:String){ // ★멤버변수★
	
}

class Sawon3{ // 접근지정어 사용 가능 
	var name:String="" // 모두 public이 생략된 것.
	var dept:String=""
	var job:String=""
}

fun main(args:Array<String>){ // main이 클래스 밖으로 나와있음... 
	var sa=Sawon("홍길동","개발부","사원")
	//println("이름:"+sa.name) // Error
	println("=============================")
	
	var sa2=Sawon2("심청이","개발부","과장")
	println("이름:"+sa2.name)
	println("부서:"+sa2.dept)
	println("직위:"+sa2.job)
	println("=============================")
	
	var sa3=Sawon3()
	sa3.name="춘향이"
	sa3.dept="개발부"
	sa3.job="대리"
	println("이름:"+sa3.name)
	println("부서:"+sa3.dept)
	println("직위:"+sa3.job)
	
}















		
		
		