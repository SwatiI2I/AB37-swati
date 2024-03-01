//Write many non static method and call it inside the main method

package packageone;

public class Assignment6

{	
	void add()
	{
	  int a,b,sum;
	  a=10;
	  b=20;
	  sum=a+b;
	  System.out.println(sum);
	}
	
	void sub()
	{
	  int a,b,sub;
	  a=100;
	  b=50;
	  sub=a-b;
	  System.out.println(sub);
	}
	 
	void mult()
	{
	  int a,b,mult;
	  a=25;
	  b=3;
	  mult=a*b;
	  System.out.println(mult);
	}
	public static void main(String[] args)
	{
		Assignment6 a6=new Assignment6();
		a6.add();
		a6.sub();
		a6.mult();
	}

}
