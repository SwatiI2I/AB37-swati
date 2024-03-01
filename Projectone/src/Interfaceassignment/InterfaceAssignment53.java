package Interfaceassignment;
interface Electronicgadget
{
	void Television();
	void Computer();
}
interface Electronicgadget2
{
	void MObile();
	void Laptop();
}
interface Electronicgadget3
{
	void Oven();
	void Refrigerator();
}
interface Electronicgadget4
{
	void Iron();
	void CompWashingmachineuter();
}
public class InterfaceAssignment53 implements Electronicgadget4,Electronicgadget3,Electronicgadget2,Electronicgadget
{
	static void AC()
	{
		System.out.println("AC");
	}

	public static void main(String[] args) 
	{
		InterfaceAssignment53 i1=new InterfaceAssignment53();
		i1.Computer();
		i1.Iron();
		AC();
		i1.Television();
	}

	
	public void Television() 
	{
		System.out.println("TV");
	}

	public void Computer() 
	{
		System.out.println("Computer");
	}
	public void MObile() 
	{
		System.out.println("mobile");
		
	}

	@Override
	public void Laptop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Oven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Refrigerator() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Iron() {
		System.out.println("Iron");
		
	}

	@Override
	public void CompWashingmachineuter() {
		// TODO Auto-generated method stub
		
	}

}
