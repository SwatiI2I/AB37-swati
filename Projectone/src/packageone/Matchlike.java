package packageone;

public class Matchlike
{

	public static void main(String[] args)
	{
String s="Anwisha";
String input="I love my India";
boolean b=s.matches("......h");
System.out.println(b);
boolean b2=s.matches("......a");
System.out.println(b2);
boolean b3=s.matches("....");
System.out.println(b3);
boolean b4=input.matches((.*)love(.*));
System.out.println(input);
	}

}
