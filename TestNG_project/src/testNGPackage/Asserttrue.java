
package testNGPackage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttrue
{
@Test
public static void login_Asserttrue()
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement fname=driver.findElement(By.id("firstName"));
	fname.sendKeys("swati");
	WebElement lname=driver.findElement(By.id("lastName"));
	lname.sendKeys("suryawanshi");

	Assert.assertFalse(true, "element is found ");
	//Assert.assertTrue(false);
	//Assert.assertEquals(fname.isDisplayed()==true, false,"Element is display");
	//Assert.assertEquals(lname.isEnabled()==true, false,"component not found");
	//Assert.assertNotEquals(driver, lname ,"not equal");
}
}

