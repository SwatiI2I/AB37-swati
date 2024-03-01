//WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables and initialize then in each method and perform addition and subtraction

package packagetwo;

public class Assignment20 
{
	static int a;
	static int b;
	
	static void add()
	{
		a=100;
		b=100;
		int sum=a+b;
		System.out.println(sum);
	}
	static void substract()
	{
		a=500;
		b=200;
		int sub=a-b;
		System.out.println(sub);
	}
   
	public static void main(String[] args)
	{
      add();
      substract();
	}

}
