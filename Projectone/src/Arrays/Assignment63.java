//Assignment 63-Create an array of length =5 of int datatype and fetch its value from scanner class.

package Arrays;

import java.util.Scanner;

public class Assignment63 

{

	public static void main(String[] args) 
	{
int rollno[]=new int[5];
for(int i=0;i<5;i++)
{
	System.out.println("enter roll no");
	Scanner s1=new Scanner(System.in);
	rollno[i]=s1.nextInt();
	
}
	System.out.println(rollno[0]);
	System.out.println(rollno[1]);
	System.out.println(rollno[2]);
	System.out.println(rollno[3]);
	System.out.println(rollno[4]);


}

	}
