class AA{
	val a:String="" // 초기값 줘야
	val b:String?=null // 객체 초기화 시 null값 이런식으로 준다. 
	val c:BB?=null
}
class BB{
	
}


fun main(args:Array<String>){
	val foods:List<String> = listOf("사과","배","수박")
	for(f in foods){
		println(f)
	}
	println("===========================")
	
	val foods2=mutableListOf("밥","국수","라면") // 뒤에 데이터형 생략 가능. (왜냐면 데이터형 자동으로 지정해주니까!)
	foods2.add("떡")
	foods2.removeAt(0)
	foods2[1]="생선"
	for(f in foods2){
		println(f)
	}
}


 
 
 
 
 
 
 
 
 
 