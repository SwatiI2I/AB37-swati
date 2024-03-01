//WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, second method argument is double a,third method argument is char a, fourth method argument is boolean a and fifth method argument is String a

package packageone;

public class Assignment11
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
	 static void mod()
		{
			 int a=25;
			 int b=2;
			 int mod=a%b;
		     System.out.println(mod);
		}

	public static void main(String[] args) 
	{
	Assignment11 a=new Assignment11();
    a.add();
    a.sub();
    mult();
    div();
    mod();
	}

}
