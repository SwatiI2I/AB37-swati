package Arrays;

public class Practicearray
{

	public static void main(String[] args) 
	{
		 int rollno[]=new int[3];   //declaration and init of an array
		 rollno[0]=10;
		 rollno[1]=41;
		 rollno[2]=14;
		 
		 for(int i=0;i<=2;i++)
		 {
			 //System.out.println(rollno[i]);

			 if(rollno[i]==41)
			 {
				 System.out.println("number 41 is present");
			 }
			 else
			 {
				 System.out.println("number 41 is not present");

			 }
		 }
	}

}
