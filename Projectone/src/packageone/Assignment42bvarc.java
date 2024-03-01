package packageone;
import java.util.Scanner;

public class Assignment42bvarc
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
	     System.out.println("Enter b");
	     int b=s1.nextInt();
	     System.out.println("Enter c");
	     int c=s1.nextInt();
	     System.out.println("sum is");
	     int sum=b+c;
	     System.out.println(sum);
	     
	     System.out.println("sub is");
	     int sub=b-c;
	     System.out.println(sub);
	     
	     System.out.println("mult is");
	     int mult=b*c;
	     System.out.println(mult);
	     
	    
		switch(3)
	     {
	     case 1:System.out.println("Addition is:" +sum);
	    	    break;
	     case 2:System.out.println("Subtraction is:" +sub);
		        break;
	     case 3:System.out.println("Muliplication is:" +mult);
	            break;
	     
	  }

    }
}