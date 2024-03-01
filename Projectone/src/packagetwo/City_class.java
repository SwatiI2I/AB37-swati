package packagetwo;
class State_class
{
	State_class()
	{
		System.out.println("1");
	}
}




public class City_class extends State_class
{
	
	City_class()
	{   super();//Explicite=forcefully written
	    //super("ram");
		System.out.println("2");
	}

	public static void main(String[] args)
	{
		City_class c1=new City_class();
		
	}

}
