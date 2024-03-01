//Assignment 50

package Interfaceassignment;
interface Countryname
{
	void Countrycode();
	void CountryZIP();
}
interface Districtname
{
	void Districtcode();
	void DistrictZIP();
}
interface Cityname
{
	void Citycode();
	void CityZIP();
}
class State implements Cityname,Districtname,Countryname
{
	static void statecollection()
	{
		System.out.println("State collection");
	}
	void statedetails()
	{
		System.out.println("State details");
	}
	
	
	public void Countrycode() 
	{
		System.out.println("country code");

	}
	public void CountryZIP() 
	{
		System.out.println("country ZIP");

	}
	public void Districtcode() 
	{
		System.out.println("district code");

	}
	public void DistrictZIP() 
	{
		System.out.println("district zip");

	}
	public void Citycode() 
	{
		System.out.println("city code");
	
	}
	public void CityZIP()
	{
		System.out.println("city zip");

	}
}
public class Interfaceass1 extends State
{

	public static void main(String[] args) 
	{
		statecollection();
		State s1=new State();
		s1.Citycode();
		s1.CityZIP();
		s1.Countrycode();
		s1.Districtcode();
	
	}

}
