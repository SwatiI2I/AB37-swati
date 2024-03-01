package selenumprog;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s1.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		
		}
	}

}
