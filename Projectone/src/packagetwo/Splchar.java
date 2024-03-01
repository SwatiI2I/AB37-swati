package packagetwo;

public class Splchar {

	public static void main(String[] args) 
	{
		String input="world no 1 @#$";
		for(int i=0;i<input.length()-1;i++)
		{
		char ch=input.charAt(i);
		if (Character.isDigit(ch)) 
		{
            System.out.println(ch);	
		}

	}

}
}
