package C_methodas;

public class Calling_non_static_Method 
{
   
	void add() // non parameterize 
	{
		System.out.println("Calling non static method");
	}
	
	void sum() //  // non parameterize 
	{
		int a =10;
		int b =20;
		int addition = a+b;
		System.out.println("addition of 2 numbers => "+addition);
		
	}
	
	void para(int a ,int b) // parameterize
	{
		int sum1 = a+b;
		System.out.println("Sum1 of two numbers => "+sum1);
	}
	
	void login(String username,String pws) // parameterize
	{
		
		System.out.println("Login succes in FB");
	}
	
	
	public static void main(String[] args) 
	{
		// creating a object of class and with the help of reference variable will call the non static method
		
		Calling_non_static_Method ref = new Calling_non_static_Method();
		
		ref.add(); // calling with help of reference variable 
		ref.sum();
		ref.para(3, 8);
		
		ref.login("newuser@gmail.com", "hello123@");
	}
}
