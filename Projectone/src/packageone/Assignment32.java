//WAP with 2 classes and call the class 2nd in class 1st with parameterized constructor
package packageone;

class Constr
{
	void add()
	{
		System.out.println("addition method in class 1");
	}
}
public class Assignment32
{
	Assignment32(int a)
	{
		Constr c1=new Constr();
		c1.add();
		System.out.println("constructor method with parameter in class 2");
	}
	public static void main(String[] args) 
	{
		Assignment32 a1=new Assignment32(23);
	
     
	}

}
