//Create few constructor and call it in main method

package packagetwo;

public class Constructorassign8 
{
	Constructorassign8(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Constructorassign8(char a)
	{
		System.out.println(a);
	}
	Constructorassign8(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		
    new Constructorassign8(100,200);
    new Constructorassign8('M');
    new Constructorassign8(12,12.266);


	}

}
