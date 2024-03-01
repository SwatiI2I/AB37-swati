package packageone;

public class Assignment106 


{
   int add(int a,int b)
   {
	   int add=a+b;
	   return add;
   }
   double multiplication(double p,double q)
   {
	   double mult=p+q;
	   return mult;
	   
   }
	public static void main(String[] args) 
	{
		Assignment106 a1=new Assignment106();
		System.out.println("Addition is :"+a1.add(10, 50));
		System.out.println("Multiplication is :"+a1.multiplication(20.7, 30.7));
}

}
