//assignment-65 Create an array of length 4 & copy its value to another array using iteration

package Arrays;

import java.util.Arrays;

public class Arraycopy65
{

	public static void main(String[] args) 
	{
		int rollno[]=new int [4];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=40;
		int rno[]=new int[4];

		for(int i=0;i<4;i++)
		{
	               rno[i]=rollno[i];
		}
		System.out.println("Original Array" +Arrays.toString(rollno));

		System.out.println("Copied Array" +Arrays.toString(rno));
	}

}
