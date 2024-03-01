package coll;

public class pract2 
{
   pract2()
   {
	   System.out.println("1");
   }
   pract2(int a)
   {
	   this();
	   System.out.println("2");
   }
   pract2(int a, int b)
   {
	   this(10);
	   System.out.println("3");
	   
   }
	public static void main(String[] args) 
	{
      new pract2(10,20);
      
       
	}

}
