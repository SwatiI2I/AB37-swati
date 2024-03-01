
package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selepartial116
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		for(int i=0;i<=3;i++) 
		{
		driver.findElement(By.partialLinkText("United")).click();
		}
	}
}
