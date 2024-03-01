package inheritance4;
   		class Three
   	{
   		static void add()
   		{
 			System.out.println("Addition");

   		}
   	}
   		
 		class Two extends Three
 	{
 		static void sub()
 		{
 			System.out.println("Substraction");
 		}
 	}
 		
 		
 	public class One extends Two

 	{
		static void div()
		{
			System.out.println("Division");

		}
		public static void main(String[] args) 
		{
			sub();
			div();
			
		}
	}


   		
