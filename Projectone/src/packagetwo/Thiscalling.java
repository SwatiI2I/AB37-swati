package packagetwo;

public class Thiscalling
{
 Thiscalling()
 {    this(14);
	 System.out.println("This is Addition");
 }
 Thiscalling(int a)
 {   	 System.out.println(a+6);
 }
	public static void main(String[] args) 
	{
     new Thiscalling();
	}

}
