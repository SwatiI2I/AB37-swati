package Encapsulation;


class Amazon
{
	private String	Username="Mahesh@gmail.com";
	
	public String getUsername()//this is getter method
	{
	return Username;
	}
	
	public void setUsername(String Username)//this is setter method
	{
	this.Username=Username; //this.Mahesh@gmail.com=abc@gmail.com
	}

}
public class Encaps 
{

	public static void main(String[] args) 
	{
	
    Amazon a1=new Amazon();
    System.out.println(a1.getUsername());
    a1.setUsername("abc@gmail.com");
    System.out.println(a1.getUsername());
	}

}
