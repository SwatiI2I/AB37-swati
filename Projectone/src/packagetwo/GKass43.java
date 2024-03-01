//WAP for single level inheritance in a single program and make all methods non static(selenium,java,gk) by creating object in child class

package packagetwo;

class Selenium
{
	void two()
	{
		System.out.println("2");

	}
}

class java extends Selenium
{
	void one()
	{
		System.out.println("1");

	}
}

public class GKass43 extends java
{
	void Three()
	{
		System.out.println("3");
	}

	public static void main(String[] args)
	{
new two();
	}

}
