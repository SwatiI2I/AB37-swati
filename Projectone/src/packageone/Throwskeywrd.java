package packageone;

public class Throwskeywrd
{
	 
	void add() throws ArithmeticException,NullPointerException, InterruptedException
	{
		Thread.sleep(2000);
		throw new ArithmeticException();
	}
	public static void main(String[] args) throws NullPointerException
	{
		//throw new ArithmeticException();
		throw new NullPointerException("I am Lucky");    //throw keyword is used to throw exception
	}

}
