package f_Scanner_class;

import java.util.Scanner;

public class Bacis_taking_inout_from_user 

{
   public static void main(String[] args) 
   {
	   Scanner s1 = new Scanner(System.in);
	   System.out.println("Plesae enter a age");
	   String sa = s1.next();
	   System.out.println("this is a value you entered  => "+sa);
	   s1.close();
   }
}
