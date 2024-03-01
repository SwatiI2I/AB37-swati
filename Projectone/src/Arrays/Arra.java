package Arrays;

public class Arra 
{

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		 name[0]="Ram";
		 name[1]="Sham";
		 name[2]="Sita";
		
		 
		 int rollno[]=new int[3];   //declaration and init of an array
		 rollno[0]=10;
		 rollno[1]=12;
		 rollno[2]=14;
		 
		 double salary[]=new double[3];
		 salary[0]=56.6;
		 salary[1]=87.78;
		 salary[2]=45.58;
		 
		 for(int i=0;i<3;i++)
		 {
			 System.out.println(name[i]);
			 System.out.println( rollno[i]);
			 System.out.println( +salary[i]);


		 }
	}

}
