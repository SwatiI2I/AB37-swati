//Assignment-90Upcasting and downcasting Problem 2 as per Diagram during Class
package packageone;


class login
{
	void login1()
	{
		
		System.out.println("This is login");
	}
}

class logout extends login
{
	void logout1()
	{
		
	}
}
public class Assignment90 extends logout
{
    void otp()
    {
    	System.out.println("This is OTP");
    }
	public static void main(String[] args)
	{
		login l1=new Assignment90();//upcasting
		l1.login1();
		Assignment90 a1=(Assignment90)l1;//downcasting
		a1.login1();
		a1.logout1();
		a1.otp();
	}

}
