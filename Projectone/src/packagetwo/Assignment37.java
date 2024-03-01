////WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables

package packagetwo;

import java.util.Scanner;

public class Assignment37 
{
	static int a;
	static int b;
	
	
    
	void add()
	{
		int sum=a+b;
		System.out.println("Addition " +  sum);
	}
	
	void sub()
	{
		int sub=a-b;
		System.out.println("substraction " +  sub);
	}
	
	void mult()
	{
		int mult=a*b;
		System.out.println("Multiplication " +  mult);
	}
	
	void div()
	{
		int div=a/b;
		System.out.println("Division " +  div);
	}

	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
	    Scanner s1=new Scanner(System.in);
	    int a=s1.nextInt();
	    int b=s1.nextInt();
	    
	    Assignment37 a1=new Assignment37();
	    Assignment37.a=a;
	    Assignment37.b=b;
	    a1.add();
	    a1.sub();
	    a1.mult();
	    a1.div();
		 
	      
	}

}
