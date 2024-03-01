//Assignment 60

package packagetwo;
class teacher
{
	public void books()
	{
		System.out.println("Book");
	}
	private void sport()
	{
		System.out.println("sport");

	}
}
class Assignment60 extends teacher
{
	protected void notebook()
	{
		System.out.println("notebooks");
	}
    
	
	
	public static void main(String[] args)
	{
		Assignment60 a1=new Assignment60();
		a1.books();
		a1.notebook();
		
	}
}
