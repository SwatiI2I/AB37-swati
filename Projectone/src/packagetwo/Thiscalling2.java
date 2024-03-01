package packagetwo;

public class Thiscalling2 
{
	Thiscalling2()
	{    this(5,5);
		System.out.println("it Is multiple constructor program");
	}
	Thiscalling2(int a,int b)
	{   this("Chaya");
		int c=a+b;
		System.out.println(c);
	}
	Thiscalling2(char s)
	{  
		System.out.println('M');

	}
	Thiscalling2(String p)
	{   this('P');
		System.out.println("Shree");

	}
	public static void main(String[] args)
	{
     new Thiscalling2();
	}

}
