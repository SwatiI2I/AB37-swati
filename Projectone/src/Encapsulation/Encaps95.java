//Assignment-95-WAP to update the value of private variable username = "abc@grotechmind.com" to something else using getter and setter
package Encapsulation;



class flipkart
{
	private String Password="abc@123";
	
	public String getPassword()
	{
		return Password;
	}
	
	public void setPassword(String Password)
	{
		this.Password=Password;
	}
	
	private String	Username="Mahesh@gmail.com";
	
	public String getUsername()//this is getter menthod
	{
	return Username;
	}
	
	public void setUsername(String Username)//this is setter method
	{
	this.Username=Username; //this.Mahesh@gmail.com=abc@gmail.com
	}
	
}
public class Encaps95
{

	public static void main(String[] args) 
	{
    flipkart f1=new flipkart();
    f1.setUsername("S@gmail.com");
    f1.setPassword("Amol@123");
    System.out.println(f1.getUsername());
    System.out.println(f1.getPassword());
    
	}

}
