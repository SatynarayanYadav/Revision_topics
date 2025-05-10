package f_Scanner_class;

import java.util.Scanner;

public class Assignment_15_Find_out_Area_of_tripezium 
{
   // Formula is  0.5(l1+l2)*h
	
	static double a =0.5; // Global variable 
	
	public static void main(String[] args)
	{
		
	     Scanner s5 = new Scanner(System.in);	
	     System.out.println("Please enter the one side lenth of tripezium");
	     double l1 = s5.nextDouble();
	     System.out.println("Please enter the second side lenth of tripezium");
	     double l2 = s5.nextDouble();
	     System.out.println("Please enter the hight of tripezium");
	     double h = s5.nextDouble();
	     double T = a*(l1+l2)*h;
	     System.out.println("Area of tripezium is => "+T);
	     s5.close();
	     

	     
	}
	
}
