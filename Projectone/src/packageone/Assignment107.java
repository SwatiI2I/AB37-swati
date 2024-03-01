//Assignment-107-WAP for return keyword for float , double , string , boolen , using scanner class
package packageone;

import java.util.Scanner;

public class Assignment107 
{
	float add(float d,float e)
	{
		float sum=d+e;
		return sum;
	}
	double sub(double a,double b)
	{
		double sub=a-b;
		return sub;
	}
	String s1()
	{
		String s="Mahesh";
		return s;
	}
	boolean ans()
	{
		boolean ans=true;
		return ans;
	}
	 
	public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
		System.out.println("Enter value a");
		 int a1=s1.nextInt();
		 System.out.println("Enter value b");
		 int b1=s1.nextInt();
		 System.out.println("Enter float value a");
		 float a=s1.nextFloat();
		 System.out.println("Enter double value a");
		 double b=s1.nextDouble();
		 System.out.println("Enter string value a");
		 String c=s1.next();
		 System.out.println("Enter boolean value a");
		 boolean d=s1.nextBoolean();
		 Assignment107 ass=new Assignment107();
		// System.out.println(ass.add(10.5, 20.5));
		 System.out.println(ass.s1());
		 System.out.println(ass.sub(20.20, 30.30));
		 System.out.println(ass.ans());

		 
	}

}
