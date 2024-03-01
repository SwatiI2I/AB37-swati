//WAP by taking value of age from scanner class and if age is greater than or equal to 18 then print " i am adult" else print " i am young"

package packagetwo;

import java.util.Scanner;

public class Assignment39 
{
	
	public static void main(String[] args)
	{
				
   int Age;
   Scanner s1=new Scanner(System.in);
   System.out.println("Enter age");

   int a=s1.nextInt();
    
   Age=a;
    if(Age>=18)
       {
    	System.out.println("I am Adult");
   
       }
    else
      {
    	System.out.println("I am Young");
       }
	}

}
