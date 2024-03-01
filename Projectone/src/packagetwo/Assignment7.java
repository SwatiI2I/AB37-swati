//Create one constructor and call it in main method

package packagetwo;

public class Assignment7
{
	Assignment7()
	{
		System.out.println("It is constructor");

	}
	public static void main(String[] args)
	{
	System.out.println("Staring main method");
	Assignment7 a1=new Assignment7();// method for calling contructor
	Assignment7 a2=new Assignment7();
    //new AddConstrtuctor();
	System.out.println("Ending main method");

	}

}
