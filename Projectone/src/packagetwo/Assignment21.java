//WAP with 3 methods main,static add and static subtract. Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods
package packagetwo;

public class Assignment21 
{
	  static  int a;
	   static int b;
	   
	    
		void add()
		{
			int sum=a+b;
			System.out.println("sum:" + sum);
		}
		void substract()
		{
			int sub=a-b;
			System.out.println("sub:" + sub);
		}
		
	public static void main(String[] args) 
	{
		 a=100;
		 b=50;
		
		Assignment21 g1=new Assignment21();
		g1.add();
		Assignment21 g2=new Assignment21();
		g2.substract();
	}

}


//public class globalvariableAssignment4 {
//    static int a;
//    static int b;
//   
//    void add() {
//        int sum = a + b;
//        System.out.println("Sum: " + sum);
//    }
//   
//    void subtract() {
//        int sub = a - b;
//        System.out.println("Sub: " + sub);
//    }
//   
//    public static void main(String[] args) {
//        a = 100;
//        b = 50;  
//       
//        globalvariableAssignment4 g1 = new globalvariableAssignment4();
//        g1.add();
//       
//        globalvariableAssignment4 g2 = new globalvariableAssignment4();
//        g2.subtract();
//    }
//}