package C_methodas;
// login to Amazon by email id or mobile no and pws
public class Method_Overloading 
{
  
	void Amazonlogin(String eamil_id, String pws)
	{
		System.out.println("Login with email id and pws");
	}
	
	void Amazonlogin(long Mo_No , String pws)
	{
		System.out.println("Login with mobile no and pws");
	}
	
	public static void main(String[] args) 
	{
		Method_Overloading Over = new Method_Overloading();
		Over.Amazonlogin("satya@gmail.com","Styuo@672" );
		Over.Amazonlogin(3765678986l, "Atrft#123");
	}
}
