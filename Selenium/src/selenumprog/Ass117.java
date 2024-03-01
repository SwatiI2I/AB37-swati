
package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass117 
{
	public static void main(String[] args) throws InterruptedException {
		
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/I2I/Downloads/learningHTML1.html");
	driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Manish123");
	Thread.sleep(2000);
}
}