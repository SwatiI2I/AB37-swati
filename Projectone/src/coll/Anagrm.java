package coll;

import java.util.Arrays;

public class Anagrm {

	public static void main(String[] args) 
	{
		String s="race";
		String s1="acrre";
		
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		if(Arrays.equals(c, c1))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
