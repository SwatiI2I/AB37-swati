//Assignment-83 Check if the String is Palindrome  

package packageone;

public class Palindromestring83 
{

	public static void main(String[] args)
	{
		String input="madam";
		String output="";

		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=input.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("The given String is palindrome");
		}
		else
		{
			System.out.println("The given String is not palindrome");

		}
	}

}
