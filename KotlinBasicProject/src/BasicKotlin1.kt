// 2020.06.08 (��) - Kotlin �⺻ ����  
/*
 1. Kotlin���� ����ϴ� ��������
   1) ������
    (1) ����
        Byte   (1byte=8bit) 
        Short  (2byte=16bit)
        Int    (4byte=32bit)
        Long   (8byte=64bit)
    (2) �Ǽ���
        Double (8byte=64bit)
        Float  (4byte=32bit)
   2) ������
    (1) ����: Char ==> ''
    (2) ���ڿ�: String ==> ""
   3) ����
    (1) Boolean: true/false 

 2. ��������
   1) ���: val
   2) ����: var
	   ex) Java                           ex) Kotlin
	       int a=10;         <== ���� ==>       var a=10  �Ǵ�  var a:Int=10  
	       final int b=20;   <== ���� ==>       val b:Int=20  �Ǵ�  val b=20
	   ex2) Kotlin
	   		- Kotiln�� JetBrain���� �������. ��״� ����Ʈ ���� ������� ȸ���, javascript�� ������ ���� �޾���.
	          ==> var, val : �ڵ� ��ȯ ���� 
	        var a=10.5
	        var b=false
   3) �迭 �ڡڡ�
	   ex) Java                                     ex) Kotlin
	       String[] names={"","",""};   <== ���� ==>      val numbers:Array<Int>=arrayOf(1,2,3,4,5)
	 													 => numbers[0]....
   
 3. ������
    1) ���������(+,-,*,/,%)
    2) ��������(&&,||)
    3) ���Կ�����(=)
    4) �񱳿�����(==,!=,<,>,<=,>=)
 
 4. ��� 
 5. �Լ� 
 6. Ŭ���� 
 7. �������̽�
 */

// 5. �Լ�
// Java: public static void main(String[] args)
fun main(args:Array<String>)
{
	val a:Int=100
	var b=200
	var c:Int
	c=300;
	println("a=$a,b=$b,c=$c") // $a: ���� a�� ��
	
	var s:String="Hello Kotlin"
	var cc='A'
	var d=10.5
	var bb=true
	var f:Float=10.5f
	println("cc=$cc,s=$s,d=$d,bb=$bb,f=$f")
}












 		