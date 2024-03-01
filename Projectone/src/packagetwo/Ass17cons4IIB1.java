package packagetwo;

public class Ass17cons4IIB1 
{
	Ass17cons4IIB1()
	{
		System.out.println("Constructor 1");
	}
	Ass17cons4IIB1(int a)
	{
		System.out.println("Constructor 2");
	}
	Ass17cons4IIB1(char a)
	{
		System.out.println("Constructor 3");
	}
	Ass17cons4IIB1(float a)
	{
		System.out.println("Constructor 4");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args)
	
	{
		new Ass17cons4IIB1();
		new Ass17cons4IIB1(23);
		new Ass17cons4IIB1('M');
		new Ass17cons4IIB1(23f);
	}
}
