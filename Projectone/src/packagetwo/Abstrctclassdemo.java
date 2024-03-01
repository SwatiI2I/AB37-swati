package packagetwo;
abstract class Api //abstract class
{
	abstract void login();  //abstract method
	abstract void auth();
	abstract void twowayauth();
}
public class Abstrctclassdemo extends Api
{

	public static void main(String[] args) 
	{
	
	}
	void login() 
	{
		System.out.println("Logic of logic");
	}
	
	void auth() 
	{
		System.out.println("Logic of auth");

	}

	void twowayauth() 
	{
		System.out.println("Logic of twowayauth");

	}

}
