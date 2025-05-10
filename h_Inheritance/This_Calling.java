package h_Inheritance;

public class This_Calling
{
	This_Calling(int a)
	{   ;
		System.out.println("1");
	}
	
	This_Calling()
	{
		this(3);
		System.out.println("2");
	}
	

	public static void main(String[] args) 
	{
	   	new This_Calling();
	}
	
	
			
}
