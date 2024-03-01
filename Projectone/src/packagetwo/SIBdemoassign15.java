//WAP with combination of SIB, IIB, main method, constructor

package packagetwo;

public class SIBdemoassign15
{
	SIBdemoassign15()
	{
		System.out.println("Constructor");

	}
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("SIB 3");
	}
	public static void main(String[] args) 
	{
		new SIBdemoassign15();
		System.out.println("It is main method");

	}

}
