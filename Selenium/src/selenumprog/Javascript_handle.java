package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascript_handle {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/I2I/OneDrive%20-%20Ideastoimpacts.com/desktop/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		WebElement e1=driver.findElement(By.id("1"));
		e1.sendKeys("Swati");
	}

}
