package packagetwo;

public class Thiskeyword

{
   int age;  //0
   String name;//null
   double salary;
   void studenet_details(int age,String name,double salary)//we dont have default values for local variable
   {
	   this.age=age;
	   this.name=name;
	   this.salary=salary;
	   
	   System.out.println("Students details as follows:");
   }
   
	public static void main(String[] args)
	{
		Thiskeyword t1=new Thiskeyword();
		t1.studenet_details(29,"Ram",7.87);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);	
	}

}
