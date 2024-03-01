package packageone;


class two
{
	two()
	{
		System.out.println("1");
	}
	two(int a)
	{
		this();
		System.out.println("2");
	}
	two(int a,int b)
	{
		this(12);
		System.out.println("3");
	}
}
public class thiskey 
{

	public static void main(String[] args)
	{
     new two(12,23);
	}

}
