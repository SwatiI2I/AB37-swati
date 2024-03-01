
package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facbook4col
{
@Test(dataProvider="data1")
public static void method1_for_facebookreg(String fname,String lname,String mobnum,String pwd)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/reg/");
	driver.manage().window().maximize();
	driver.findElement(By.name("firstname")).sendKeys(fname);
	driver.findElement(By.name("lastname")).sendKeys(lname);
	driver.findElement(By.name("reg_email__")).sendKeys(mobnum);
	driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
    driver.quit();
}
@DataProvider(name="data1")
public Object[][] method1()
{
	Object d1[][]=new Object[8][4];
	d1[0][0]="swati";
	d1[0][1]="sury";
	d1[0][2]="swati@gmail.com";
	d1[0][3]="amazon.in";
	
	d1[1][0]="123";
	d1[1][1]="#@";
	d1[1][2]="989898988";
	d1[1][3]="amazon.in";
	
	d1[2][0]="8787889999";
	d1[2][1]="suryawanashi";
	d1[2][2]=" ";
	d1[2][3]="amazon.in";
	
	d1[3][0]="6576889900";
	d1[3][1]="sury";
	d1[3][2]="swati@gmail.com";
	d1[3][3]="1212";
	
	d1[4][0]="@#$$";
	d1[4][1]="sury";
	d1[4][2]="S@gmail";
	d1[4][3]="ab@123";
	
	d1[5][0]=" ";
	d1[5][1]="%$$";
	d1[5][2]="swati@gmail.";
	d1[5][3]="amazon.in";
	
	d1[6][0]="sw a t ttyyi  @##";
	d1[6][1]="";
	d1[6][2]="swatigmail.com";
	d1[6][3]="amazon.in";
	
	d1[7][0]="";
	d1[7][1]="";
	d1[7][2]="swatigmail.com";
	d1[7][3]="amazon.in";
	
	/*d1[8][0]="s";
	d1[8][1]="";
	d1[8][2]="swatigmail@@.com";
	d1[8][3]="";
	
	d1[9][0]="#";
	d1[9][1]="";
	d1[9][2]="";
	d1[9][3]="";
	
	d1[10][0]="";
	d1[10][1]="";
	d1[10][2]="";
	d1[10][3]="";
	
	d1[11][0]="____";
	d1[11][1]="";
	d1[11][2]=".com";
	d1[11][3]="abc";*/
	return d1;
	
}
}
