package selenumprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classlinkscnt
{

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
List<WebElement> links= driver.findElements(By.xpath("//a"));
System.out.println("Link are as below: "+links.size());


for(int i=0;i<=links.size()-1;i++)
{
	WebElement e1= links.get(i);
	String url=e1.getAttribute("href");
	System.out.println(url);
	
}
	}

}
