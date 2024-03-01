package selenumprog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		String Parentid=driver.getWindowHandle();
		Set<String> parentandchildid=driver.getWindowHandles();
        System.out.println(Parentid);
		System.out.println(parentandchildid);
		
		//driver.close(); //it will close parent
		
		Iterator<String> pcid=parentandchildid.iterator();
		String parentid=pcid.next();
		String childid=pcid.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		driver.close();
		
		WebElement ee1=	driver.findElement(By.id("identifierId"));
		ee1.sendKeys("S@gmail.com");
	}

}
