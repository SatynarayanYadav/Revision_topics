package f_Scanner_class;

import java.util.Scanner;

public class Assignment_19_GTM_Registration_form 
{
  public static void main(String[] args) 
  {
	 System.out.println("### Please follow the given instruction in the screen and enter the value for registration ### "); 
	 
	 Scanner s9 = new Scanner(System.in);
	 System.out.println("Pleas Enter your First Name ");
	   String Fname = s9.next();  
	 System.out.println("Pleas Enter your Last Name ");
	   String Lname = s9.next(); 
	 System.out.println("Pleas Enter your Email id ");
	   String Email = s9.next();  
	 System.out.println("Pleas Enter your Password ");
	   String Pws = s9.next();
	 System.out.println("Pleas Enter your Gender ");
	   String Gender = s9.next();
	 System.out.println("Pleas Enter your Present Address ");
	   String Pre_Address = s9.next();
	 System.out.println("Pleas Enter your Permanent Address ");
	   String Per_Address = s9.next();
	 System.out.println("Pleas Enter your location pincode ");
	   long Pincode = s9.nextLong(); 
	 System.out.println(" ***Wlcome***");  
	 System.out.println("+++++ your Registration is completed ++++++");
	 System.out.println("Thank you for choosing us");
	 System.out.println(" Please cross check your details ");
	 System.out.println("First Name => "+Fname);
	 System.out.println("Last Name => "+Lname);
	 System.out.println("Email ID => "+Email);
	 System.out.println("Password => "+Pws);
	 System.out.println("Your Gender => "+Gender);
	 System.out.println("Youre Precent address => "+Pre_Address);
	 System.out.println("your Permanebt address => "+Per_Address);
	 System.out.println("Your location pincode => "+Pincode);
	 
	 s9.close();
  }
}
