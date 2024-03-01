//WAP to  calculate the area of circle.(pi value should be final static local variable and initialise). 

package packagetwo;

public class Assignment30 
{
    final static double pi=3.14;
    static void areacircle()
    {
    	int r=14;
    	double areacircle=pi*r*r;
    	System.out.println(areacircle);

    }
    
	public static void main(String[] args)
	{
        int r=7;
        double areacircle=pi*r*r;
       	System.out.println(areacircle);
       	areacircle();
           
	}

}
