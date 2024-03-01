//Assignment-101-WAP on Priorityqueue
package coll;

import java.util.Collections;
import java.util.PriorityQueue;

public class CollectPriorityQueue101
{

	public static void main(String[] args) 
	{
		PriorityQueue q1=new PriorityQueue();
		q1.add("Ram");
		q1.add("Anwisha");
		q1.add("Ram");
		q1.add("Ram");
    	q1.add("Ram");
		q1.add("Ritu");
		q1.add("Rt");
		q1.add("bharat");

		//q1.add(null);

		//Collections.sort(q1);
		/*q1.add(false);
		q1.add(null);
		q1.add(true);
		q1.add(false);
		q1.add('U');
		q1.add(123);
		q1.add(12.2323);*/
		System.out.println(q1);
	}

}
