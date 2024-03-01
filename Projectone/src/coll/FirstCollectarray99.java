//Assignment-99-WAP on arrayList
package coll;

import java.util.ArrayList;

public class FirstCollectarray99
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Manoj");
		a1.add("Ram");
		a1.add("Dipak");
		a1.add("Chetan");
		a1.add("Ravi");  //arraylist accept index accept hetrogenious,accept duplicate,accept dynamic value,null values
		a1.add(18);
		a1.add(true);
		a1.add('C');
		a1.add(true);
		a1.add(null);
		System.out.println(a1);
	}

}
