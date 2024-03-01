//Assignment 52-Create child class and 2 interfaces and create relation of child class with interface(1st) and relation of child class with interface(2nd) and achieve multiple level inheritance
package Interfaceassignment;
interface language
{
	void English();
	void Hindi();
}
interface science
{
	void Science();
	void Socialscience();
}
abstract class computer implements science,language
{
	abstract void MSexcel();
	abstract void MSword();
}
public class Interfaceassignment52 extends computer
{
    void GK()
    {
    	System.out.println("GK");
    }
	public static void main(String[] args)
	{
		Interfaceassignment52 i3=new Interfaceassignment52();
		i3.English();
		i3.GK();
		i3.Hindi();
	}
	public void Science()
	{
    	System.out.println("science");

	}
	
	public void Socialscience()
	{
    	System.out.println("socialscience");

	}
	public void English()
	{
    	System.out.println("english");

	}
	public void Hindi() 
	{
    	System.out.println("hindi");

	}
	void MSexcel() 
	{
    	System.out.println("msexcel");

	}
	
	void MSword()
	{
    	System.out.println("msword");

	}

}
