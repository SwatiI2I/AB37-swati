package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Unmpwd2d 
{
@Test(dataProvider="data1")
public static void method1_uname_pwd(String uname,String pwd)
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("s@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("abc@123");
	driver.findElement(By.name("login")).click();
	driver.close();
}

@DataProvider(name="data1")
public Object[][] method1()
{
	Object d1[][]=new Object[2][2];
			d1[0][0]="Ram@gmail.com";
			d1[0][1]="abc@123";
			d1[1][0]="Sham@yahoo.in";
			d1[1][1]="shan@123";
			return d1;
}
}
