package testNGPackage;

import org.testng.annotations.Test;

public class Grouptst
{
	@Test(groups= {"smok","system"})
	public void add()
	{
		System.out.println("Add");
	}
	@Test(groups= {"system"})
	public void sub()
	{
		System.out.println("sub");
	}
	@Test(groups= {"smok"})
	public void mult()
	{
		System.out.println("mult");
	}
	@Test
	public void div()
	{
		System.out.println("div");
	}
	@Test(groups= {"system"})
	public void mod()
	{
		System.out.println("mod");
	}
}
