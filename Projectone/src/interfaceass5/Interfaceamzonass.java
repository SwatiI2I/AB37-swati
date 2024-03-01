package interfaceass5;
//Assignment 49-Create a class and in this create interface as Amazon with login and logout methods also create child class and create relation between them 

interface Amazon
{
	void login();
}

interface Flipkart
{
	void logout();
}
public  class Interfaceamzonass implements Flipkart,Amazon
{

	public static void main(String[] args) 
	{
		Interfaceamzonass a1=new Interfaceamzonass();
		a1.login();
		a1.logout();
	
	}

	public void login()
	{
		System.out.println("it is login method");		
	}

	public void logout() 
	{
		System.out.println("it is logout method");		
		
	}

	

}
