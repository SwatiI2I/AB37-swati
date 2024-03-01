package coll;

interface operation
{
	void add();
	void mult();
	
}
interface operation2
{
	void sub();
	void div();
}
 abstract class math implements operation2,operation
{
 static void mod()
 {
	 System.out.println("mod");
 }
}
 class interfc extends math
 {
	 
	public static void main(String[] args) 
	{
		interfc i1=new interfc();
		i1.add();
		i1.sub();
		i1.mod();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		
	}
 }

	