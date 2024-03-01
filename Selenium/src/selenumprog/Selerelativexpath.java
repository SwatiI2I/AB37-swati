package selenumprog;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selerelativexpath 
{

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		//driver.get("https://www.google.com");
		driver.findElement(By.xpath("(//input)[@id='twotabsearchtextbox']")).sendKeys("shoes");
		driver.findElement(By.xpath("(//input)[@id='nav-search-submit-button']")).click();
		
		//driver.findElement(By.xpath("(//input)[7]")).sendKeys("S@gmail.com");
		//driver.findElement(By.xpath("(//input)[10]")).click();

	}

}
