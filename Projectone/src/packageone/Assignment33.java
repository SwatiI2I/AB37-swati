//WAP to find the Area of Circle , keep pi as static global final , create 2 methods 1 having r = 7 and another having r =14

package packageone;

public class Assignment33
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