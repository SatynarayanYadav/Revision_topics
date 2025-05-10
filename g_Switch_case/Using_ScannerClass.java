package g_Switch_case;

import java.util.Scanner;

public class Using_ScannerClass 
{
   public static void main(String[] args) 
   {
	   System.out.println("Please press 1 for milk");
	   System.out.println("Please press 2 for bread");
	   System.out.println("Please press 3 for egg");
	   System.out.println("Please press 4 for curd");
	   Scanner s = new Scanner(System.in);
	      int value =    s.nextInt();
	      
	      switch(value)
	      {
	      case 1:
	    	  System.out.println("Take a milk ");
	    	  break;
	    	  
	      case 2: 
	    	  System.out.println("Take a bread");
	    	  break;
	    	  
	      case 3: 
	    	  System.out.println("Take a egg");
	    	  break;
	    	  
	      case 4: 
	    	  
	    	  System.out.println("Take a curd");
	    	  break;
	      default :
	    	  System.out.println("Please select the right value ");
	    		  
	      }
	      s.close();
	   
   }
}
