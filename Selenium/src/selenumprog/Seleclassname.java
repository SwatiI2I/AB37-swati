package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleclassname {

	public static void main(String[] args)
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.className("gLFyf")).sendKeys(("India"));

	}

}
