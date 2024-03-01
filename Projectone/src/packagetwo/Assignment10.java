//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. Multiply and divide in last two and call in main method.

package packagetwo;

public class Assignment10
{
	void add()
	{
		int a=10;
		int b=12;
		int sum=a+b;
		System.out.println(sum);
	}
	
	void sub()
	{
		int a=20;
		int b=12;
		int sub=a-b;
		System.out.println(sub);
		//classname ref variable=new classname();
		//ref variable.nonstaticmethod();
	}
	
	 static void mult()
	{
		 int a=20;
		 int b=12;
		 int mult=a*b;
	     System.out.println(mult);
	}
	 
	 static void div()
		{
			 int a=20;
			 int b=10;
			 int div=a/b;
		     System.out.println(div);
		}

	public static void main(String[] args) 
	{
	Assignment10 a=new Assignment10();
    a.add();
    a.sub();
    mult();
    div();
	}

}
