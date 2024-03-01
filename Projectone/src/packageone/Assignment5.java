//Write a non static method and call it inside the main method
package packageone;

public class Assignment5 
{
	 void add()
	  {
		  int a,b,sum;
		  a=10;
		  b=20;
		  sum=a+b;
		  System.out.println(sum);
	  }
	public static void main(String[] args)
	{
		Assignment5 a1=new Assignment5();
		a1.add();
	}

}
