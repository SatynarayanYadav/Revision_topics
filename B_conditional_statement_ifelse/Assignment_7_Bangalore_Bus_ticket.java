package B_conditional_statement_ifelse;
/*
Male		below 2	               free
            above 2 and till 12	   half ticket
            adult 13 to 60	       full ticket
            Sr Citizen 61 to 	   half ticket
female	                           free		
*/
public class Assignment_7_Bangalore_Bus_ticket 
{
    
	public static void main(String[] args) 
	{
	  	String M = "Male";
	  	String F = "Female";
	  	int agebelow = 2 ;
	  	int ageabove = 11 ;
	  	int tillchild = 12;
	  	int adultagefrom = 50;
	  	int adultagetill = 60;
	  	int Sr_citizen = 61;
	  	
	  	
	  	
	  	if (M == "Male" && agebelow>1)
	  	{
	  		System.out.println("2> below age 2 tickte is free");
	  		if(ageabove>2 && tillchild>=10)
	  		{
	  			System.out.println("3> above age 2 to till age 12 tickte is half");
	  			if(adultagefrom>=13 || adultagetill<=60)
	  			{
	  				System.out.println("4> for adult age 13 to till age 60 tickte is full");
	  			}
	  			if(Sr_citizen<=61)
	  			{
	  				System.out.println("5> for Sr citizen age above 60  tickte is free");

	  			}
	  			
	  		}	
	  		else
	  		{
	  			System.out.println("===Error Please confirm the age===");
	  				
	  		}
	  	 }
	  	 else
	  	 {
	  		System.out.println("1> But tcicket is Free for Females");
	  	 }	
	}
}
