package C_methodas;

class new_Method  // child class method is overriding the parent call method here parent class is supresing
{
    void login()
    {
    	System.out.println("login with mo No");
    }
}


public class Method_Overriding extends new_Method
{
    
	void login()
	{
		
		System.out.println("login with Email id");
	}
	
	public static void main(String[] args) 
	{
		Method_Overriding obj = new Method_Overriding();
		obj.login();
	}
}
