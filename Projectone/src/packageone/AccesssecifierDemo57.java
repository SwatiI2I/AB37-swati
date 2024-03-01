//Assignment 57-Create a class with 4 different methods other than main method with 4 different access specifiers and try to access them within class
package packageone;

public class AccesssecifierDemo57
{
	public void add()
	{
		System.out.println("Add");
	}
	private void sub()
	{
		int a=10,b=20;
		int sub=a-b;
		System.out.println(sub);

	}
	protected void mult()
	{
		System.out.println("Mult");

	}
	void div()
	{
		System.out.println("Div");

	}

	public static void main(String[] args) 
	{
		AccesssecifierDemo57 a1=new AccesssecifierDemo57();
		a1.add();
		a1.div();
		a1.sub();
		a1.mult();
	}

}
