package A_datatype_basic_programs;

public class Assignment3_4_Static_M_inside_main_method 
{
    
	static void first_method() // created a static method
	{
		System.out.println("==> Call static method inside the main method");
	}
	
	static void second_method ()
	{
		System.out.println("==> Call second method inside the main method");
	}
	
	public static void main (String[]args)
	{
		first_method(); // calling static method in the main method
		second_method();
		System.out.println("==> this is a main method");
	}
}
