package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windowpopup {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.shine.com/registration/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("id_file"));
		e1.sendKeys("C:/Users/I2I/OneDrive - Ideastoimpacts.com/Microsoft Teams Chat Files/saket gaware.pdf");
	}

}
