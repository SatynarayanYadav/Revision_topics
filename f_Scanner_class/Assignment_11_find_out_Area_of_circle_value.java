package f_Scanner_class;

import java.util.Scanner;

public class Assignment_11_find_out_Area_of_circle_value 
{
    public static void main(String[] args) 
    {
	     double   pi = 3.14;	// local variable 
	     
	     Scanner s1 = new Scanner(System.in);
	     System.out.println("Enter the radias of the circle number");
	         int r =  s1.nextInt();
	         double area_of_circle = pi*r*r;  
	     System.out.println("Area of circle value is = >"+area_of_circle);
	         s1.close();
	         
	}
}
