package f_Scanner_class;

import java.util.Scanner;

public class Assignment_16_Find_out_Circumferance_of_Circle 
{
    // Formula  2*pi*r
	
	static double pi = 3.14;
	
	public static void main(String[] args) 
	{
	  Scanner s6 = new Scanner(System.in);
	  System.out.println("Please enter Radius of circle");
	  double r = s6.nextDouble();
	  double C = 2*pi*r;
	  System.out.println("Circumferance of Circle is => "+C);
	  s6.close();
	}
}
