//Assignment 54-Create child class having relation with Abstract class and that abstract class is having relation with 2 different interfaces

package interfaceass5;

interface countryname
{
	void India();
	void UAE();
}
interface statename
{
	void Maharashtra();
	void Goa();
}
public class Interfaceassignment54 implements statename,countryname
{
    void Districtname()
    {
    	System.out.println("Nashik");
    }
    static void Talukaname()
    {
    	System.out.println("Satana");
    }
	public static void main(String[] args) 
	{
		Interfaceassignment54 i1=new Interfaceassignment54();
		i1.India();
		i1.Maharashtra();
		i1.UAE();
		i1.Goa();
		i1.Districtname();
		Talukaname();
		
	}
	public void India()
	{
		System.out.println("India");
	}
	
	public void UAE() 
	{
		System.out.println("UAE");

	}
	public void Maharashtra() 
	{
		System.out.println("Maharashtra");

	}
	public void Goa() 
	{
		System.out.println("Goa");

	}

}

