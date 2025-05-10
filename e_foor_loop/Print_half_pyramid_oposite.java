package e_foor_loop;

public class Print_half_pyramid_oposite
{
   public static void main(String[] args) 
   {
	     int a = 5;
	     
	     for (int i = a; i>=1; i--)   // outer
	     {
	    	 for (int j=1; j<=i; j++ )  // inner
	    	 {
	    		 System.out.print("*");
	    	 }
	    	System.out.println(" "); 
	     }
   }
}
