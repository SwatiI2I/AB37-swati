//WAP with 4 constructors and 1 IIB


package packagetwo;

public class Assignment17
{

Assignment17()
	{
	System.out.println("Constructor 1");
	}
Assignment17(int a)
	{
	System.out.println("Constructor 2");
	}
Assignment17(char b)
	{
	System.out.println("Constructor 3");
	}
Assignment17(String s)
	{
	System.out.println("Constructor 4");
	}

{
	{
        System.out.println("IIB 1");
	}
}
	
	public static void main(String[] args)
	{
     System.out.println("Main Method");
     new Assignment17();
	}
    
}

