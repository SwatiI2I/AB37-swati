package packageone;
class one1
{
	one1(int a)
	{
		System.out.println("1");
	}
}
public class superkey extends one1
{
   superkey()
   { 
	   super(12);
	   System.out.println("2");
   }
	public static void main(String[] args)
	{
    new superkey();
	}

}
