package testNGPackage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swa100 
{
   @Test(dataProvider="data1")
	public static void  method1_for_addition(int number)

	{
		System.out.println(number+100);

	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{100},{200},{300},{400},{500}};
	}

}
