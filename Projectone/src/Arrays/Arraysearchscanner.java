package Arrays;

import java.util.Scanner;

public class Arraysearchscanner 
{

	public static void main(String[] args)
	{
     int length[]=new int[5];
     System.out.println("Enter the value of index: ");
     for(int i=0;i<=4;i++)
     {
    	Scanner s1 =new Scanner(System.in);
    	length[i]= s1.nextInt();
     }
     System.out.println(length[0]);
     System.out.println(length[1]);
     System.out.println(length[2]);
     System.out.println(length[3]);
     System.out.println(length[4]);
	}

}
