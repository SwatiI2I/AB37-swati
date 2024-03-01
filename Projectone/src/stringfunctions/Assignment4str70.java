//Assignment-70 Print my name is swati in reverse vertical manner
package stringfunctions;

public class Assignment4str70 
{

	public static void main(String[] args) 
	{
		String s1="My name is swati";
		//System.out.println(s1.length());
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
