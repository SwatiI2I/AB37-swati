package Arrays;

import java.util.Arrays;

public class Stringcpyarray

{

	public static void main(String[] args)
	{
	String name[]=new String[4];
	name[0]="Mahi";
	name[1]="Swati";
	name[2]="Shreyansh";
	name[3]="Kapadnis";
	String nm2[]=new String[4];

	for(int i=0;i<4;i++)
	{
		nm2[i]=name[i];
		System.out.println(name[i]);
		System.out.println(nm2[i]);
	}
	
}
	}
