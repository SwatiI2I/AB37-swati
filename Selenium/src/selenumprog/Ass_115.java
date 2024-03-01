package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass_115 {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
	}

}
