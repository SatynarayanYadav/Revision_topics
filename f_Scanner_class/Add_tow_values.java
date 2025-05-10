package f_Scanner_class;

import java.util.Scanner;

public class Add_tow_values
{
     public static void main (String []args)
     
     {
    	 Scanner s2 = new Scanner(System.in);
    	 System.out.println("Enter the 1st value ");
    	  int a = s2.nextInt();
    	 System.out.println("Enter the 2nd value");
    	   int b = s2.nextInt();
    	   
    	   int c = a+b;
    	   
    	 System.out.println("sum of the value entered by user =>"+c);
    	 s2.close();
    	  
     }
}
