package selenumprog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibibo {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement e=driver.findElement(By.id(""));
		//Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("(//span)[3]"));
		e.click();
		
		
		WebElement e1=driver.findElement(By.xpath("(//div)[21]"));
		e1.sendKeys("Bengluru");
	}

}
