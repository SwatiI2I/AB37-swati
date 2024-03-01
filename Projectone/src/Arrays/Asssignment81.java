//Asssignment 81-Find out number of char and number of digits in below string
//Rahul123
package Arrays;

public class Asssignment81 
{

	public static void main(String[] args) 
	{
		String s1="Rahiul123";
		char c1[]=s1.toCharArray();

		for(int i=0;i<s1.length()-1;i++)
		{
			boolean b1=Character.isDigit((c1[i]));
			if(b1==true)
			{
				System.out.println(c1[i] +" it is digit");
			}
			else
			{
				System.out.println(c1[i] +" it is character");

			}
}
	}

}
