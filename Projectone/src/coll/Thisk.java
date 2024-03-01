package coll;

public class Thisk 
{

	Thisk()
	{
		System.out.println("1");

	}
	Thisk(int a)
	{
		this();
		System.out.println("2");
	}
	Thisk(int a,int b)
	{
		this(12);
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		new Thisk(12);
	
	}

}
