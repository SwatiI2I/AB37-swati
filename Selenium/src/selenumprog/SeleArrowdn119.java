package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleArrowdn119 {

	public static void main(String[] args) 
	{
 EdgeDriver driver=new EdgeDriver();
 driver.get("https://www.amazon.in");
 driver.manage().window().maximize();
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("software books");
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}
