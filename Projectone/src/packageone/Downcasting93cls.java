//Assignment 93-Upcasting and downcasting Problem 5 as per Diagram during Class


package packageone;
class Upcasting3
{
	void upcasting3()
	{
		System.out.println("3");
	}
}
class Upcasting2 extends Upcasting3
{
	void upcasting2()
	{
		System.out.println("2");
	}
}
class Upcasting01 extends Upcasting2
{
	void upcasting01()
	{
		System.out.println("1");
	}
}
public class Downcasting93cls extends Upcasting01
{

	public static void main(String[] args) 
	{
Upcasting2 u1=new Upcasting01();
u1.upcasting2();
u1.upcasting3();
Upcasting01 u2=(Upcasting01) u1; //downcasting
u2.upcasting01();
u2.upcasting2();
u2.upcasting3();
	}

}
