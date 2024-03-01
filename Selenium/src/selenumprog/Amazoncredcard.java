
package selenumprog;
 

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazoncredcard
{

	public static void main(String[] args)  throws NoSuchElementException
	{
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement e=driver.findElement(By.id("nav-link-accountList"));
Actions a=new Actions(driver);

a.moveToElement(e).perform();

WebElement e1=driver.findElement(By.linkText("Sign in"));
e1.click();


driver.findElement(By.id("ap_email")).sendKeys("suryawanshi.swati20@gmail.com");
driver.findElement(By.id("continue")).click();

driver.findElement(By.id("ap_password")).sendKeys("Shree@2018");
driver.findElement(By.id("signInSubmit")).click();

WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
Search.sendKeys("Books");
Search.sendKeys(Keys.ENTER);

//WebElement Book=driver.findElement(By.xpath("))


	}
}


