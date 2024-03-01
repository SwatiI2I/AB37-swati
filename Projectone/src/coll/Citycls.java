package coll;
class state
{
	state()
	{
		System.out.println("Constructor 1");
	}
}
public class Citycls extends state
{
	Citycls(int a)
	{
		//super();
		System.out.println("Constructor 2");

	}
	public static void main(String[] args) 
	{
	   
		Citycls c=new Citycls(12);
	}

}
