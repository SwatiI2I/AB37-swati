package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testngprog5
{
	@Test

	public static void add5()
		{
		
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement Cate_dd= driver.findElement(By.id("searchDropdownBox"));
			Select s1=new Select(Cate_dd);
			s1.selectByValue("search-alias=furniture");
			s1.selectByVisibleText("Books");
			//s1.selectByIndex(5);				
		}
	
}
