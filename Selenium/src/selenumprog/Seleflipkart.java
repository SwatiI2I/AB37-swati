package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleflipkart {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		WebElement a1= driver.findElement(By.name("q"));
		a1.sendKeys("books");
		a1.sendKeys(Keys.ENTER);
	}

}
