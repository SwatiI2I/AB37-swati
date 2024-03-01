//Assignment-71 WAP to display system time and date. Store day,date,month year values in String

package stringfunctions;

import java.util.Date;

public class Assignment5str71
{

	public static void main(String[] args) 
	{
     Date d1=new Date();
     d1.getTime();
     System.out.println(d1.getTime());
     Date d2=new Date(d1.getTime());
     System.out.println(d2);
     String mydate=d2.toString();
     System.out.println(mydate);
     String day=mydate.substring(0,3);
     System.out.println("day is: " +day);
     String month=mydate.substring(3,8);
     System.out.println(mydate.length());
     System.out.println("month is :" +month);
     String date=mydate.substring(8,11);
     System.out.println("date is: " +date);
     String year=mydate.substring(24);
     System.out.println("year is: " +year);
     

	}

}
