package h_Inheritance;

import java.util.Scanner;

public class Assignment_21_Multi_level1 
{
       void dairy_items_list()
       {
    	   System.out.println("Press 1 for Milk");
    	   System.out.println("Press 2 for bread");
    	   System.out.println("Press 3 for Cured");
    	   System.out.println("Press 4 for egg");
    	   Scanner s1 = new Scanner(System.in);
    	  
    	   int a= s1.nextInt();
    	   if (a==1)
    	   {
    		   System.out.println("please take your Milk");
    		   
    		   
    		   
    	   }
    	   else if(a==2)
    	   {
    		   System.out.println("Please take your Bread");
    	   }
    	   else if(a==3)
    	   {
    		   System.out.println("Please take your Curd");
    	   }
    	   else if(a==4)
    	   {
    		   System.out.println("Please take your Egg");
    	   }
    	   else
    	   {
    		   System.out.println("Please press the wright number to get the product");
    	   }
    	   
    	   s1.close();
       }
}
