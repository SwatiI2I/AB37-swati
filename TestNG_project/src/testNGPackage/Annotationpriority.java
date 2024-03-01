package testNGPackage;

import org.testng.annotations.Test;

public class Annotationpriority
{
@Test(priority=1)
public void method1()
	{
	
	}
@Test(invocationCount=5,priority=0)
public void method2()
	{
	
	}

}
