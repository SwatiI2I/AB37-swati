package packagetwo;

public class Assignment8 
{
	Assignment8()
	{
		System.out.println("This is assignment 8");
	}
	Assignment8(int a)
	{
		System.out.println("This is parameterised constructor int a");
	}
	Assignment8(char s)
	{
		System.out.println("This is parameterised constructor with char s");
	}
	
	public static void main(String[] args) 
	{
     new Assignment8();
     Assignment8 a8=new Assignment8(233);//object creation
     new Assignment8('a');
	}

}
