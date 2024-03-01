package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert3param 
{
@Test
public static void loginToAmazon()
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	WebElement e2=driver.findElement(By.linkText("Sign in"));
	e2.click();
	
	driver.findElement(By.id("ap_email")).sendKeys("suryawanshi.swati20@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Shree@2018");
	driver.findElement(By.id("signInSubmit")).click();
	WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertFalse(false, "component not found");
	//Assert.assertFalse(false);
	//Assert.assertTrue(Search.isDisplayed()==false, "Sry componant not found");
	//Assert.assertTrue(Search.isDisplayed()==true);
	//Assert.assertEquals(Search.isDisplayed(), true);// we are performing assertion on search textfield
}

}
