package f_Scanner_class;

import java.util.Scanner;

public class Assignment_14_Find_out_Area_of_triangle 
{
   // formula  Area of triangle 0.5*h*h
	
	static double b =0.5; // Global variable make as static 
	
	public static void main(String[] args) 
	{
	   Scanner s4 = new Scanner(System.in);	
	   System.out.println("Please enter the traiangle hight");
	   double h = s4.nextDouble();
	   double T = b*h*h;
	   System.out.println("Area of triangle is => "+T);
	   s4.close();
	   
	}
}
