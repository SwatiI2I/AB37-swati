package packageone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling 
{
	public static void main(String[] args) 
	{
		try 
		{
			//int c=1/0;
			//System.out.println("Try will execute");
			Scanner s1=new Scanner(System.in);
		    boolean myanswer=s1.nextBoolean();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception handling");
		}
		catch(NullPointerException a2)
		{
			System.out.println("NullPointerException Exception ");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("it is InputMismatch Exception ");
		}
	}

}
