package packagetwo;
class one
{
	one()
	{
		System.out.println("1");
	}
}

class two extends one
{
	two()
	{
		System.out.println("2");
	}
}

public class assign46 extends two
{
	assign46()
	{
		System.out.println("3");
	}


	public static void main(String[] args) 
	{
    //class3 c3=new class3();
    two t2=new two();
	}

}
