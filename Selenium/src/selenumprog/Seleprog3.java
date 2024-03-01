package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleprog3 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("suryawanshi.swati20@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Swati@123");
		driver.findElement(By.name("login")).click();

	}

}
