//Create one static method and call in inside a main method

package packagetwo;

public class Assignment4
{
  static void add()
  {
	  int a=20;
	  int b=30;
	  int sum=a+b;
	  System.out.println(sum);
  }
  
  static void print()
  {
	  char a='S';
	  System.out.println(a);
  }
  
  static void println()
  {
	  String s ="Shree";
	  System.out.println(s); 
  }
   void write()
  {
	  int salary =54678;
	  System.out.println(salary); 
  }
	public static void main(String[] args)
	{

	add();
	print();
	println();
	Assignment3 a3=new Assignment3();
	a3.write();
	
	}

}
