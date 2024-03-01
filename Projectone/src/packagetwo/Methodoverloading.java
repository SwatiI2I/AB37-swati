package packagetwo;

public class Methodoverloading 
{
void add(int a)
{
	System.out.println(a);
}
static void add(double a)
{
	System.out.println(a);

}
void add(char a)
{
	System.out.println('S');
}
static void add(boolean a)
{
	System.out.println(a);

}
static void add(String a)
{
	System.out.println("Sahil");

}
	public static void main(String[] args) 
	{
		Methodoverloading m1=new Methodoverloading();
		m1.add(23);
		add(23.23);
		add(true);
		add("Saket");
		Methodoverloading m2=new Methodoverloading();
		m2.add('s');		
	}

}
