//Assignment 61
WAP to handle below 2 exceptions by using 2 catch blocks
//Scanner s1= new Scannerint c = 1/0; int a = s1.nextint();

package packageone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tryandcatch61
{

	public static void main(String[] args)
	{
	try
	{
		Scanner s1=new Scanner(System.in);
		int a1=s1.nextInt();
		//int c=1/0;

	}
	catch(ArithmeticException a1)
	{
		System.out.println("this is arith metic exception");
	}
	catch(InputMismatchException a2)
	{
		System.out.println("this is input mismatch exception");
	}
	catch(NullPointerException a1)
	{
		System.out.println("this is NullPointer exception");
	}
	finally
	{
		System.out.println("this is finally block");

	}
}
}
