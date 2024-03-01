package selenumprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginsbi_rightclick {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("S@gmail.com");
		WebElement password=driver.findElement(By.id("label2"));
		password.sendKeys("S@sw@12");
		WebElement captcha=driver.findElement(By.id("loginCaptchaValue"));
		captcha.sendKeys("2cxgx");
	}

}
