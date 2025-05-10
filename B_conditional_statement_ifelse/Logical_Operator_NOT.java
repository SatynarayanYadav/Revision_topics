package B_conditional_statement_ifelse;

public class Logical_Operator_NOT 
{
   public static void main(String[] args) 
   {
	     int a =10;
	     int b =20;
	     //AND
	     if (!(a<9))
	     {
	    	 System.out.println("print And block 1");
	     }
	     if (!(a<8 && b>20))
	     {
	    	 System.out.println("print And block 2");
	     }
	     if(!(a==10 && b==20))
	     {
	    	 System.out.println("print And block 3");
	     }
	     //OR
	     if (!(a>10 || b<20)) //F||F
	     {
	    	 System.out.println("print OR block 1");
	     }
   }
}
