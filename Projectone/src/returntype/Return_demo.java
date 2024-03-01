package returntype;

public class Return_demo 
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	double subtract(int a,double b)
	{
		double sub=a-b;
		return sub;
	}

	public static void main(String[] args) 
	{
     Return_demo d1=new Return_demo();
     d1.add(10, 20);
     d1.subtract(100, 12.40);
	}

}
