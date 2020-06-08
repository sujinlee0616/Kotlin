import java.util.*
// Kotlin: Java의 라이브러리를 필요할 때, 변경 없이 사용 가능 ==> Math.random() 등
// ==> 잘 모르는건 걍 Java에서 갖고오면된다! :) 
// 형변환 : toDouble(), toString()

/*  <Kotlin 에서의 함수>
 	1. 리턴형이 있는 경우
       fun 함수명(매개변수):데이터형{...} ==> 리턴형은 ':'뒤의 데이터형.
 	2. 리턴형이 없는 경우
       fun 함수명 (매개변수){...} ==> void  */

fun main(args:Array<String>){

	var temp=(Math.random()*100)+1
	var com=temp.toInt() // 형변환
	println("com=$com")
	
	var scan=Scanner(System.`in`)
	while(true){
		println("1~100까지의 정수를 입력해주세요.")
		var i=scan.nextInt()
		if(i<0 || i>100){
			println("1~100까지의 정수를 입력해주세요. :( ")
			continue
		}
		if(i<com){
			println("입력값보다 큰 값을 입력하세요.")
		}
		else if(i>com){
			println("입력값보다 작은 값을 입력하세요.")
		}
		else{
			println("Game Over!!")
			break
		}
	}
}







