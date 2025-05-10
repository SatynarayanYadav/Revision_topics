package e_foor_loop;

public class Print_half_pyramind_0_1_numbers 
{
   public static void main(String[] args) 
   {
	   int r = 5;
	   
	   // outer loop
	   for (int i = 1; i<=r; i++)
	   {
		   for (int j = 1; j<=i; j++)
		   {
			   int sum = i+j;
			   if (sum % 2 ==0)
			   {
				   System.out.print("1 ");
			   }
			   else
			   {
				   System.out.print("0 ");
			   }
		   }
		   System.out.println();
	   }
   }
}
