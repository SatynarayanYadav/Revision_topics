package h_Inheritance;

class amazon
{
	final void login() // using final keyword here 
	{
		System.out.println("login with email id");
	}
}

public class Final_Keyword_Mathod extends amazon
{
	void login_mo()
	{
		
		System.out.println("login with Mo_no");

	}
	
	public static void main(String[] args) 
	{
		Final_Keyword_Mathod m1 = new Final_Keyword_Mathod();
		m1.login_mo();
		m1.login();
	}

}
