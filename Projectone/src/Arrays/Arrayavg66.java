//Assignment-66Create an array of length 4 of int data type and find out average of those numbers and remainder of those

package Arrays;

public class Arrayavg66
{

	public static void main(String[] args) 
	{
		int rollno[]=new int [4];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=30;
		rollno[3]=40;
		//double average=rollno[0]+rollno[1]+rollno[2]+rollno[3]/4;
		//System.out.println(average);
		
		int sum=0,average;
		for(int i=0;i<rollno.length;i++)
		{
			sum=sum+rollno[i];			
		}
		System.out.println("The Sum is: " +sum);
		average=sum/rollno.length;
		System.out.println("Average is: " +average);
	
	
	
	
	}
	
}
