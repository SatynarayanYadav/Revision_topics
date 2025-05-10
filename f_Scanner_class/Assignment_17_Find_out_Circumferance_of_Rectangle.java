package f_Scanner_class;

import java.util.Scanner;

public class Assignment_17_Find_out_Circumferance_of_Rectangle 
{
	// formula 2(B+H)
    public static void main(String[] args) 
    {
	   	Scanner s7 = new Scanner(System.in);
	   	System.out.println("Please enter the base of rectangle");
	   	double B = s7.nextDouble();
	   	System.out.println("Please enter the hight of rectangle");
	   	double H = s7.nextDouble();
	   	double Re = 2*(B+H);
	   	System.out.println("Circumferance of Rectangle is => "+Re);
	   	s7.close();
	}
}
