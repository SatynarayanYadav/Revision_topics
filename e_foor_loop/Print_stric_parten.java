package e_foor_loop;

public class Print_stric_parten 
{
   public static void main(String[] args) 
   {
	    for (int a = 1; a<=6; a++)  //loop for row total number of row is 6 
	    {
	    	for (int b=1; b<=a; b++) // Loop for column 
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
   }
}