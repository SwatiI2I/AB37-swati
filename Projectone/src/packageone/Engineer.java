package packageone;

class Manager
{
	void meeting()
	{
		
	}
}
public class Engineer extends Manager
{  
	void standup()
	{
		
	}
class Intern extends Engineer
{
	void Assignments()
	{
		
	}
}
	public static void main(String[] args) 
	{
        Manager m1 =new Intern();
        m1.meeting();
       
	}

}
