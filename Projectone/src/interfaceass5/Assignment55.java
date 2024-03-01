//Assignment 55-Create child class having relation with abstract class
//at abstract class having relation with interface(1st) &
//that interface(1st) having relation with another interface(2nd)
package interfaceass5;

interface country
{
 void India();
}
interface state
{
	void Benglore();
}
abstract class City implements state,country
{
	static void Nashik()
	{
		System.out.println("Nashik city");
	}
}
	public class Assignment55 extends City
{
	
	public static void main(String[] args)
	{
		Assignment55 a1=new Assignment55();
		City.Nashik();
		a1.Benglore();
		a1.India();
	}

	public void Benglore()
	{
		System.out.println("Benglore");		
	}
	public void India()
	{
		System.out.println("India");		
	}

}
