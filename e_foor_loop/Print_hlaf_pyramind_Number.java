package e_foor_loop;

import java.util.Scanner;

public class Print_hlaf_pyramind_Number 
{
    public static void main(String[] args) 
    {
	     Scanner s = new Scanner (System.in);
	     System.out.println("Enter your number " );
	     int n=  s.nextInt();
	     
	     System.out.println("your number is => "+n);
	     
	     for (int i=1; i<=n; i++)
	     {
	    	 for (int j=1; j<=i;j++)
	    	 {
	    		 System.out.print(j);
	    	 }
	    	 System.out.println();
	     }
	     
	    s.close();     
	         
	}
}
