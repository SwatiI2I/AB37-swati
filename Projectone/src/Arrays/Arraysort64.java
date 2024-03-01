//Assignment 64-Create an array of length 3 having String datatype and print it without sorting. Now Sort the array and print its value after sorting.
//Use toString function to print the array

package Arrays;

import java.util.Arrays;

public class Arraysort64
{

	public static void main(String[] args)
	{
String name[]=new String[4];
name[0]="Radha";
name[1]="Sham";
name[2]="Vasu";
name[3]="Shree";
System.out.println(Arrays.toString(name));
Arrays.sort(name);
System.out.println(Arrays.toString(name));


	int rollno[]=new int[4];
	rollno[0]=98;
	rollno[1]=55;
	rollno[2]=66;
	rollno[3]=88;
	Arrays.sort(rollno);
	System.out.println("Sorted Array" +Arrays.toString( rollno));

	}

}
