package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleprog112 {

	public static void main(String[] args) 
	{
		EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.grotechminds.com/registration");
		e1.findElement(By.id("Username")).sendKeys("Mahesh123");
		e1.findElement(By.id("password")).sendKeys("Swati@123");

	}

}
