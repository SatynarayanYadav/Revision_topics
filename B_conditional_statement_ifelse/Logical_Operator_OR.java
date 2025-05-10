package B_conditional_statement_ifelse;

public class Logical_Operator_OR 
{
  public static void main(String[] args) 
  {
	 int a =10;
	 int b =20;
	 
	 if (a==12 || b==20) // F || T
	 {
		 System.out.println("Print the OR case block 1");
	 }
	 if (a==8 || b==10) // F || F
	 {
		 System.out.println("Print the OR case block 2");
	 }
	 
	 if (a>8 || b<10) // T || T
	 {
		 System.out.println("Print the OR case block 3");
	 }
  }
}
