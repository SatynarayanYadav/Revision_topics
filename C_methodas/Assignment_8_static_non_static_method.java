package C_methodas;

public class Assignment_8_static_non_static_method 
{
    
	void test()
	{
		System.out.println("No static Method 1");
	}
	
	void add(int a , int b)
	{
		int addition = a+b;
		System.out.println("Para non static Addition => "+addition);
	}
	
	static void main()
	{
		System.out.println("static Method 1");
	}
	
	static void sub(int c ,int d)
	{
		int subtraction = c-d;
		System.out.println("Para static method subtraction => "+subtraction);
	}
	
	static void logingmail(long Mo_No, String pws)
	{
		System.out.println("Logged in the Gmail succesfully by mobile number ");
	}
	public static void main(String[] args) 
	{
		// creating a object of class  
		Assignment_8_static_non_static_method  obj1 = new Assignment_8_static_non_static_method (); 
		obj1.test();
		obj1.add(10, 55);
		main();
		sub(10, 6);
		logingmail(8765356781l, "Tfgst@134");
	}
}
