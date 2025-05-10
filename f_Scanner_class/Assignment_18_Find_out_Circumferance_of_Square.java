package f_Scanner_class;

import java.util.Scanner;

public class Assignment_18_Find_out_Circumferance_of_Square 
{
   // formula 4*A
	
   public static void main(String[] args) 
   {
	    Scanner s8 =new Scanner(System.in);	
	    System.out.println("Pleas enter one side lent of square");
	    double A = s8.nextDouble();
	    double Sq = 4*A;
	    System.out.println("Circumferance of Square is => "+Sq);
	    s8.close();
   }
}
