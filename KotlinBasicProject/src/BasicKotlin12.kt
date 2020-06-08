fun add(x:Int,y:Int):Int{
	return x+y
}

fun add2(x:Int,y:Int)=x+y

// ¶÷´Ù½Ä
var add3={x:Int,y:Int->x+y}

fun main(args:Array<String>)
{
	var a=add(10,20)
	var b=add2(100,200)
	var c=add3(100,200)
	println("a=$a,b=$b,c=$c")
	
}



