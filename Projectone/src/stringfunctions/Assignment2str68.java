//Assignment-68 Print software testing word in vertical manner

package stringfunctions;

public class Assignment2str68
{

	public static void main(String[] args) 
	{
		String s1="Software";
		String s2="Testing";
		String s3=(s1.concat(s2));
		//System.out.println(s3);
		
		for(int i=0;i<=s3.length()-1;i++)
		{
			System.out.println(s3.charAt(i));
		}
	}

}
