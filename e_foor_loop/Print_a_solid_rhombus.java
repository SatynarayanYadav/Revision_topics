package e_foor_loop;

public class Print_a_solid_rhombus 
{
   public static void main(String[] args) 
   {
	      int n =9;
	      int s = 5;
	      
	      for (int i =1; i<=n; i++)
	      {
	    	  for(int j =1; j<=s-i; j++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int j =0; j<=i; j++)
	    	  {
	    		  System.out.print("* ");
	    	  }	
	    	System.out.println();  
	      }
   }
}
