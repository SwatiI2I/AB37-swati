//Assignment92-Upcasting and downcasting Problem 4 as per Diagram during Class

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
class Upcasting1 extends Upcasting2
{
	void upcasting1()
	{
		System.out.println("1");
	}
}
public class Downcasting92 extends Upcasting1
{

	public static void main(String[] args)
	{
Upcasting2 u1=new Upcasting1();  //upcasting
u1.upcasting2();
u1.upcasting3();
Upcasting1 u2=(Upcasting1) u1 ;//downcasting
u2.upcasting1();
u2.upcasting2();
u2.upcasting3();
	}

}
