//Assignment 51-Create 1 child class having main method ,1 abstarct class having 1 abstract method and 1 concrete method and interface having abstarct method and create relation between child class->Abstract class->Interface
package Interfaceassignment;
interface Tax
{
	void ITtax();
	void GSTtax();
}
interface Revenue
{
	void servicetax();
	static void ttax()
    {
    	System.out.println("It is concrete method of ttax");
    }
}
abstract class Propertytax implements Revenue,Tax
{
	abstract void salestax();
}

public class Interfaceassignment51 extends Propertytax
{

	public static void main(String[] args) 
	{
		Interfaceassignment51 i1=new Interfaceassignment51();
		i1.GSTtax();
		i1.ITtax();
		i1.salestax();
		i1.servicetax();
		
	}
	public void servicetax() 
	{
		   System.out.println("Service tax");

	}
	public void ITtax()
	{
		   System.out.println("IT tax");

	}
	public void GSTtax() 
	{
		   System.out.println("GST tax");
	
	}
	void salestax()
	{
		   System.out.println("sales tax");

	}

}
