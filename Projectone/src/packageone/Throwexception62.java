//Assignment 62-WAP by using throw keyword
//if the age of a person is > 18 then allow him to access www.google.com else throw an ArithmeticException

package packageone;

import java.util.Scanner;

public class Throwexception62
{

	public static void main(String[] args) 
	{
  Scanner s1=new Scanner(System.in);
  int age=s1.nextInt();
 
  if(age>18) 
  {
	  System.out.println("Allow to visit google.com website");
  }
  else
  {
	  throw new ArithmeticException();
		  
  }
  
	}

}
