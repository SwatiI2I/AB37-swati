
package packagetwo;

import java.util.Scanner;

public class Assignment40
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
	     System.out.println("Enter a");
	     int a=s1.nextInt();
	     System.out.println("Enter b");
	     int b=s1.nextInt();
	     System.out.println("sum is");
	     int sum=a+b;
	     System.out.println(sum);
	     switch(sum)
	     {
	     case 1:System.out.println("Number 1");
	    	    break;
	     case 2:System.out.println("Number 2");
		        break;
	     case 3:System.out.println("Number 3");
	            break;
	     case 4:System.out.println("Number 4");
	             break;
	  }

    }
}