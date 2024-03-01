//Assignment91-Upcasting and downcasting Problem 3 as per Diagram during Class


package packageone;


class Grandparent
{
	void gparent()
	{
		System.out.println("this is gparent");
	}
}
class parents extends Grandparent
{
	void parents()
	{
		System.out.println("this is Parents");
	}
}
class childrens extends parents
{
	void childrens()
	{
		System.out.println("this is childrens");
	}
}
public class Downcast91 extends childrens
{

	public static void main(String[] args)
	{
    parents p1=new childrens();
    p1.gparent();
    p1.parents();
    childrens c1= (childrens)p1;
    c1.childrens();
    c1.gparent();
    c1.parents();
   
   
	}

}
