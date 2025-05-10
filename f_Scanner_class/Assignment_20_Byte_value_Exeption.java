package f_Scanner_class;

import java.util.Scanner;

public class Assignment_20_Byte_value_Exeption 
{
   public static void main(String[] args) 
   {
	   Scanner s9 = new Scanner(System.in);
	   System.out.println("Plesae enter the value as 32000");
	    byte b= s9.nextByte();
	   System.out.println("value of byte 3200 => "+b); 
	   s9.close();
   }
}
