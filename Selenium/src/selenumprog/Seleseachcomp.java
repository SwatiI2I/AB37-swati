package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleseachcomp {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement first_name= driver.findElement(By.xpath("//input[@id='fname']"));
		boolean checking_first_name=first_name.isDisplayed(); //boolean value absrtact method
		if(checking_first_name==true)
		{
			first_name.sendKeys("Amaravati");
		}
		else
		{
			System.out.println("Nothing");
		}
		
	}

}
