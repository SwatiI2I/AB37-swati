package coll;

public class encap 
{
	private String Username="S@gmail.com";
	
	public String getUsername()
	{
		return Username;
	}
	
	public void setUsername(String Username)
	{
		this.Username=Username;
	}
	public static void main(String[] args)
	{
		encap e1=new encap();
		System.out.println(e1.getUsername());
		e1.setUsername("trer@gmail.com");
		System.out.println(e1.getUsername());

	}

}
