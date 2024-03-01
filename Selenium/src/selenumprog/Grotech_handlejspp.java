package selenumprog;

import org.openqa.selenium.edge.EdgeDriver;

public class Grotech_handlejspp {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		//driver.getTitle();
	}

}
