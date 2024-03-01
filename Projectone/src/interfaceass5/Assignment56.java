//Assignment 56-Create child class having relation with interface(1st)
//1st interface having relation with 2nd interface
//2nd interface having relation with 3rd interface
package interfaceass5;
interface one
{
	 void number1();
}
interface two extends one
{
	 void number2();
}
interface three extends two
{
	 void three();
}
public class Assignment56 implements three
{
 
	public static void main(String[] args) 
	{
		Assignment56 a1=new Assignment56();
		a1.three();
	}
	public void number2() 
	{
		System.out.println("number2");		
	}

	public void number1() 
	{
		System.out.println("number1");		
	}

	public void three()
	{
		System.out.println("number3");		
	}

}
