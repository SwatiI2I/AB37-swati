//Create an array of length 5. Find out the index of number 41

package stringfunctions;

public class Assignment76 
{
	static int i=0;
	public static void main(String[] args)
	{

		int n1[]= {12,34,65,41,23};
		int n2=41;
		for( i=0;i<=4;i++)
		{
			if(n2==n1[i])
			{
				System.out.println("index number of " +  n2 + " is :" +i);
				break;
			}		
		}
		if(n2!=n1[i])
		{
			System.out.println();

		}
	}
}
