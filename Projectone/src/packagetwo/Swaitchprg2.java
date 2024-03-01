package packagetwo;
import java.util.Scanner;

public class Swaitchprg2 
{

	public static void main(String[] args) 
	{
     Scanner s1=new Scanner(System.in);
     System.out.println("Enter a");
     int a=s1.nextInt();
     switch(a)
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
