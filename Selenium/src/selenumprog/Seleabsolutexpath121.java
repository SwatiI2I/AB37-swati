package selenumprog;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleabsolutexpath121 {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/I2I/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Manish123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Password@1234");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/input[\"text\"][2]")).sendKeys("My Fav Place");
		Thread.sleep(2000);

		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Swati Kapadnis");
		Thread.sleep(2000);

		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(/html/body/input)[4])")).click();

	}

}
