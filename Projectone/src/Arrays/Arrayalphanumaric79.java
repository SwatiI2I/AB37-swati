//assignment79 Take any alphanumeric String and find out which are numeric values and characters and print it

package Arrays;

public class Arrayalphanumaric79
{

	public static void main(String[] args) 
	{
		String name="Swati123";
		char c1[]=name.toCharArray();
		//System.out.println(c1[0]); 
		for(int i=0;i<=name.length()-1;i++)
       {
	
    	   boolean answer=Character.isDigit(c1[i]);
    	   if(answer==true)
    	   {
        	   System.out.println(c1[i]+ " "+" It is Digit: ");
    	   }
    	   else
    	   {
        	   System.out.println(c1[i]+ " "+" It is Character: ");

    	   }
       }
	}

}
