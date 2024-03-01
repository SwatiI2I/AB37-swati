package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selerelxpathfb4 
{

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("S@gmail.com");
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"A");
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");


}

}
