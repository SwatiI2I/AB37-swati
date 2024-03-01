//create a class and create two concrete methods inside a class(static add, non static sub), create abstract class and create two abstract mthods (multiplication, divison), create two concrete methods inside main method 

package packagetwo;
class  Concrete2
{
	 static void add()
	{
		System.out.println("Add");
	}
	void sub()
	{
		
	}
}
abstract class Abstract extends Concrete2
{
	abstract void mult();
	abstract void div();
}
public class Ass48 extends Abstract
{
	 static void mod()
	 {
		 System.out.println("Mod");
	 }
	 static void per()
	 {
		 System.out.println("Percentage");
}
	 
	public static void main(String[] args)
	{
     mod();
     per();
	}
	
	void mult() 
	{
		
	}
	void div() 
	{
		
	}

}
