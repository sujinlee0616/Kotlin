/*
   <��Ʋ���� Ư��>
   1. ���� Ÿ�� ���� ���
    - �������� ���� �����ϸ� �˾Ƽ� ������ Ÿ�� ������.
      ex) var a:Int, var a=10
   2. ���Ἲ, �ǿ뼺, ������
    - Java JVM ��� ==> Java�� ������ Kotlin �ۼ� ����
   3. ��ȣ��� 
    - ex) import java.util.*  �̷������� Java ���̺귯���� �״�� ���� �ͼ� ����� �� �ִ�.  
*/

// 4.��� - if, when(Java������ switch~case��), for, while

// ex) 
	fun main(args:Array<String>)
	{
		/*var a=10
		var b=20
		var c=max(a,b)
		println("max=$c")
		var d=30
		var e=50
		var k=max1(d,e)
		println("max=$k")*/
		
		var score=85;
		var jumsu=hakjum(score)
		println("score=$score, jumsu=$jumsu ����")
	}

    // �Լ� ����� ���1) 
	// fun �Լ���(�Ű�����...)            ===> void �Լ���(�Ű�����)       ===> (X). Error. 
	// fun �Լ���(�Ű�����...):return��       ===> return�� �Լ���(�Ű�����)    ===> (O).
	fun max(a:Int,b:Int):Int
	{
		var c:Int
		if(a>b)
			c=a
		else
			c=b
		return c
	}

	// �Լ� ����� ���2) 
	fun max1(a:Int,b:Int):Int=if(a>b) a else b

	// �Լ� ����� ���3) �Լ��� �������� ����.   
	fun max2(a:Int,b:Int)=if(a>b) a else b
	

/*
   <if ���ǹ�>
   if(����)
   if(����) ~ else
   if(����) ~ else if(����) ~ else 
 */

fun hakjum(a:Int):Char
{
	var c:Char='A'
	if(a>=90)
		c='A'
	else if(a>=80)
		c='B'
	else if(a>=70)
		c='C'
	else if(a>=60)
		c='D'
	else
		c='F'
	return c
}











