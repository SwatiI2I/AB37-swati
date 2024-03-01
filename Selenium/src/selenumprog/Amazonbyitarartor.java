package selenumprog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonbyitarartor {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement shoes=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		shoes.click();
		Set<String> selectedshoes= driver.getWindowHandles();
		System.out.println(selectedshoes);
		Iterator<String> pcid=	selectedshoes.iterator();
		String pid=pcid.next();//parentid alone
		String cid=pcid.next();//childid alone
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		//driver.close();
		
		driver.findElement(By.id("add-to-cart-button")).click();
	
	}

}
