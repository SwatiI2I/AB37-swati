package coll;


class one
{
	one(int a,int b)
	{
		System.out.println("1");
	}
}
public class Superk 
{
	Superk(int a,int b)
	{
		super();
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Superk s1=new Superk(12,12);
	}

}
