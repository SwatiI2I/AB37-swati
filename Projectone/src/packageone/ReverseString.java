//most importanat question

package packageone;

public class ReverseString 
{

	public static void main(String[] args)
	{
String input="Shree";
String output="";

for(int i=input.length()-1;i>=0;i--)
{
	char reverse=input.charAt(i);
	output=output+reverse;
}
System.out.println(output);
	}

}
