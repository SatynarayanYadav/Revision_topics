package f_Scanner_class;

import java.util.Scanner;

public class Assignment_12_Find_out_Area_of_Rectangle 
{
      // formula is Length*Width
	
  public static void main(String[] args) 
  {
	 Scanner s2 = new Scanner(System.in); 
	 System.out.println("Enter the Lenght of Area");
	    double Lenght = s2.nextDouble();
	 System.out.println("Enter the Width of Area");
	    double Width = s2.nextDouble(); 
	    
	    double Area_of_Rectangle = Lenght*Width;
	 System.out.println("Area of Rectangle is => "+Area_of_Rectangle);   
	    s2.close();
	 
  }
}
