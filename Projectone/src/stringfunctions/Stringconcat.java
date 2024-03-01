package stringfunctions;

public class Stringconcat 
{

	public static void main(String[] args) 
	{
		String a="Masalazonehotel";
		String b="Dosa";
		System.out.println(a.concat(" ").concat(b));
		System.out.println(a.charAt(2));		
		System.out.println(a.indexOf('M'));
		System.out.println(a.substring(3));
		System.out.println(a.substring(2,6));
		System.out.println(a.contains("z"));
		System.out.println(a.matches("zone"));
		System.out.println(a.isEmpty());
		String m="";
		System.out.println(m.isEmpty());
		System.out.println(a.endsWith("p"));








	}

}
