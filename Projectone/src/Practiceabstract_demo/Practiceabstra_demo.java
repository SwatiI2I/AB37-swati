package Practiceabstract_demo;

abstract class Abstract_demo1
{
	abstract void logout();
}
abstract class Abstract2 extends Abstract_demo1
{
	abstract void register();
	abstract void login();

}
public class Practiceabstra_demo extends Abstract2
{
   static void OTP()
   {
	   System.out.println("Logic of OTP");
   }
   void Accountcreate()
   {
	   System.out.println("Account create");
   }

	public static void main(String[] args) 
	{
      OTP();
      Practiceabstra_demo p1=new Practiceabstra_demo();
      p1.Accountcreate();
	}
	void register() 
	{
		
	}
	void login()
	{
		
	}
	
	void logout() 
	{
		
	}

}
