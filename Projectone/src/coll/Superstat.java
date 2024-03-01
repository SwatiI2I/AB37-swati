package coll;

class one
{
	one(int a)
	{
		System.out.println("1");
	}
}
public class Superstat extends one

{
   public Superstat(int a)
    {
	   super(12);
    	System.out.println("2");	
    }
	public static void main(String[] args)
	{
		Superstat s1=	new Superstat(12);
		
	}

}
