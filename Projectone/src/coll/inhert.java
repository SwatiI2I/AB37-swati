package coll;

class teacher
{
	void add()
	{
		System.out.println("Add");
	}
}
class mentor extends teacher
{
	void sub()
	{
		System.out.println("sub"););
	}
}
public class inhert extends mentor
{

	public static void main(String[] args)
	{
		inhert i1=new inhert();
		i1.add();
		i1.sub();
	}

}
