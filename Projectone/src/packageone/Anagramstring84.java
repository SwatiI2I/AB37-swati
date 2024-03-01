//Assignment 84 Check that given two string is Anagram to each other

package packageone;

public class Anagramstring84
{

	public static void main(String[] args) 
	{
		String a1="animal";
		String a2="malina";
		
	if(a1.length()!=a2.length()) 
	{
		System.out.println("String is not anagram");
	}
	else
	{
		char[] c1=a1.toCharArray();
		Array.sort(c1);
		System.out.println("");
		
	}

}
