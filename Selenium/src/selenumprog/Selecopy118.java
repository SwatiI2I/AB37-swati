package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecopy118 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Swati Kapadnis Nsk");
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);

		/*driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Username")).sendKeys("Swati_mahesh");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");*/
		
	}

}
