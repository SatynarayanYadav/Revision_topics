package h_Inheritance;

public class Hirerchial_level3 extends Hirerchial_level_login_page
{
   void paynow()
   {
	   System.out.println("Please pay to procced");
   }
   public static void main(String[] args) 
   {
	   login();
	   Hirerchial_level3 ob = new Hirerchial_level3();
	   ob.paynow();
   }
}
