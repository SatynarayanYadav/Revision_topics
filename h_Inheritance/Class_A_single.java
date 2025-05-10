package h_Inheritance;

import java.util.Scanner;

public class Class_A_single
{
     static void hello()
     {
    	 Scanner s1 = new Scanner(System.in);
    	 System.out.println("Please enter the 1st value");
    	 int a = s1.nextInt();
    	 System.out.println("Please enter the 2nd value");
    	 int b = s1.nextInt();
    	 
    	 int c = a+b;
    	 System.out.println("Sum of the values = >"+c);
    	 s1.close();
     }
}
