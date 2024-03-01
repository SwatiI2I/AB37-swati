package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion
{
@Test
public void testcase()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement	e1=driver.findElement(By.name("q"));
	e1.sendKeys("India");
	e1.sendKeys(Keys.ENTER);
	//Assert.assertEquals(driver.getTitle(),"India - Google Search");
	Assert.assertEquals(driver.getTitle(),"India - Google Search","Sorry");
	//driver.quit();
}
}
