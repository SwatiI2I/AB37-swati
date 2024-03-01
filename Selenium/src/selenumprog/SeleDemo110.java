package selenumprog;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleDemo110 
{

	public static void main(String[] args)
	{
//ChromeDriver c1=new ChromeDriver();
//c1.get("https://www.google.com/");
EdgeDriver e1=new EdgeDriver();
e1.get("https://www.google.com");
e1.close();
	}

}
