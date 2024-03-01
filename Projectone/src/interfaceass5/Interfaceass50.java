//Assignment 50-Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it) and create relation between child class->interface(1st)->interface(2nd)
package interfaceass5;
interface Year
{
	void Yr1991();
	void Yr2018();
}
abstract class Month implements Year
{
	abstract void Apr();
	abstract void Feb();
}
public class Interfaceass50 extends Month
{
     static void day()
 {
	 System.out.println("Monday");
 }

	public static void main(String[] args) 
	{
      day();
      Interfaceass50 i1=new Interfaceass50();
      i1.Apr();
      i1.Feb();
      i1.Yr1991();
      i1.Yr2018();
	}

	@Override
	public void Yr1991() {
		 System.out.println("yr1991");
		
	}

	@Override
	public void Yr2018() {
		 System.out.println("yr2018");
		
	}

	@Override
	void Apr() {
		 System.out.println("Apr");
		
	}

	@Override
	void Feb() {
		 System.out.println("feb");
		
	}

}
