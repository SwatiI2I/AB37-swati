package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvamazonllogin
{
@Test(dataProvider="data1")
public static void method1_for_login(String uname,String pwd)
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys(uname);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.id("signInSubmit")).click();
	driver.quit();

}
@DataProvider(name="data1")
public Object[][] method1()
{
	Object d1[][]=new Object[7][2];
	d1[0][0]="swati@gmail.com";
	d1[0][1]="amazon.in";

	d1[1][0]="swati@gmail.com";
	d1[1][1]="amazon.in";
	//d1[1][1]="wrong password";
	
	d1[2][0]="swatiks@gmail.com";
	d1[2][1]="amazon.in";
	d1[3][0]="swati3232@gmail.com";
	d1[3][1]="amazon.in";
	d1[4][0]="";
	d1[4][1]="amazon";
	d1[5][0]="swatisurys@gmail.com";
	d1[5][1]="amazon.in";
	d1[6][0]="surys@gmail.com";
	d1[6][1]="";
	return d1;
	
}
}
