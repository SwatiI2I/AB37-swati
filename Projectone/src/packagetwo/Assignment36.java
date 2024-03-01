package packagetwo;

//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as local variables

import java.util.Scanner;

public class Assignment36
{
    static void add()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enetr Number one:");
        int a=s1.nextInt();
        System.out.println("Enetr Number Two:");
        int b=s1.nextInt();
        System.out.println("Sum is:");
        int sum=a+b;
        System.out.println(sum);
    }
    static void sub()
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enetr Number one:");
        int a=s2.nextInt();
        System.out.println("Enetr Number two:");
        int b=s2.nextInt();
        System.out.println("Substration is:");
        int sub=a-b;
        System.out.println(sub);
    }
    static void mult()
    {
        Scanner s3=new Scanner(System.in);
        System.out.println("Enetr Number one:");
        int a=s3.nextInt();
        System.out.println("Enetr Number two:");
        int b=s3.nextInt();
        System.out.println("Multiplication is:");
        int mult=a*b;
        System.out.println(mult);

    }
    static void div()
    {
        Scanner s4=new Scanner(System.in);
        System.out.println("Enetr Number one:");
        int a=s4.nextInt();
        System.out.println("Enetr Number Two:");
        int b=s4.nextInt();
        System.out.println("Division is:");
        int div=a/b;
        System.out.println(div);

    }
    
	public static void main(String[] args)
	{
     int a=10;
     int b=20;
     add();
     sub();
     mult();
     div();
	}

}
