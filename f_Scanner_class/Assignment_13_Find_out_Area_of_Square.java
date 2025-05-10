package f_Scanner_class;

import java.util.Scanner;

public class Assignment_13_Find_out_Area_of_Square 
{
   public static void main(String[] args) 
   {
	    Scanner s3 = new Scanner(System.in);
	    System.out.println("Enter the side value of square");
	     double a  = s3.nextDouble();
	     double square = a*a;
	    System.out.println("Area of Square value is => "+square);
	     s3.close();
	    		 
	    
   }
}
