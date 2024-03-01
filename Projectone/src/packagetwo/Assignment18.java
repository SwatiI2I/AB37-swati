//wap with local variable 

package packagetwo;

public class Assignment18 
{
static void add(int a,int b)
 {
	    int sum=a+b;
		System.out.println(sum);

 }
 void add(char a)
 {
		System.out.println('S');

 }
	public static void main(String[] args)
	{		
		int salary; //declaration
		salary=98543; //initialization
		//or
		//int salary=98463;  //initialization and declaration
		System.out.println(salary);
		add(10,20);
		Assignment18 v1=new Assignment18();
		v1.add('a');
	}

}
