package Practiceconcrete_demo;
class Concrete_1
{
	static void teacher()
	{
		System.out.println("Teacher");
	}
	 void counceler()
	{
		System.out.println("counceller");

	}
}
class concrete_2 extends Concrete_1
{
	 void mentor()
	{
		System.out.println("mentor");
	}
}
abstract class absr_1 extends concrete_2
{
	abstract void student();
	void Teamlead()
	{}
}
public class Concrete_demo extends absr_1
{
    void monitor()
    {}
	public static void main(String[] args) 
	{
    teacher();
    Concrete_1 c1=new Concrete_1();
    c1.counceler();
    concrete_2 c2=new concrete_2();
    c2.mentor();
    }
	void student() {
		
	}

}
