//WAP to find the circumference of a circle .(pi should be final static global).

package packagetwo;

public class Assignment31
{
    final static double pi=3.14;
    static void Circumferencearea()
    {
    	int r=14;
    	double Circumferencearea=2*pi*r;
    	System.out.println(Circumferencearea);

    }
    
	public static void main(String[] args)
	{
        int r=7;
        double Circumferencearea=2*pi*r;
       	System.out.println(Circumferencearea);
       	Circumferencearea();
           
	}

}
