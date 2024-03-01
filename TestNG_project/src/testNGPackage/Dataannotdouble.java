package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataannotdouble 
{
@Test(dataProvider="data1")
public static void method1_double(double a)
{
	System.out.println(a);
}

@DataProvider(name="data1")
public Object[][] method1()
{
	return  new Object[][] {{10.20},{20.30},{30.40},{40.50},{50.60}};
}
	}


