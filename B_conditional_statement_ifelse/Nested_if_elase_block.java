package B_conditional_statement_ifelse;

public class Nested_if_elase_block 
{
   public static void main(String[] args) 
   {
	    int a = 10;
	    int b = 20;
	    
	    if(a<b)
	    {
	    	if(a<=b)
	    	{
	    		System.out.println("1");
	    		
	    	     if(a==b)
	    	     {
	    	    	System.out.println("2"); 
	    	     }	 
	    	     else
	    	     {
	    	    	 System.out.println("3");
	    	     }
	    	}    
	    	else
	    	{
	    		System.out.println("4");
	    	}	
	    }
	    else
	    {
	    	System.out.println("5");
	    }
   }
}
