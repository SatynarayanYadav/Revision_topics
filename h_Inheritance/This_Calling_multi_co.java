package h_Inheritance;

public class This_Calling_multi_co 
{
	This_Calling_multi_co(String name)
	{
		System.out.println("Print the student name =>"+name);
	}
	This_Calling_multi_co(int id)
	{
		this("satya");
		System.out.println("Print the student id =>"+id);
	}
	This_Calling_multi_co(double d)
	{
		this(5446);
		System.out.println("Print the fee of student =>"+d);
	}
	This_Calling_multi_co()
	{
		this(23366.00);
		System.out.println("Print the student details");
	}
	
	public static void main(String[] args) 
	{
		
		new This_Calling_multi_co(); 
	}
}
