package e_foor_loop;

public class Print_half_pyramid_1to15_Number 
{
  public static void main(String[] args) 
  {
	  int n = 5;
	  int number = 1;
	  
	  for (int i =1; i<=n; i++)
	  {
		  for (int j=1; j<=i; j++)
		  {
			  System.out.print(number+" ");
			  number++;
			  
		  }
		 System.out.println(); 
	  }
  }
}
