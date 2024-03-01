//Assignment 75-Create an array of length 4 of int data type. Find out 41 is present or not in array. Print message in both the cases.

package stringfunctions;

public class Assignment75 
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
				System.out.println("the given number  is present in array:"+ n2);
				break;
			}		
		}
		if(n2!=n1[i])
		{
			System.out.println("the given number is not present in array:"+ n2);

		}
	}

}
