package C_methodas;

public class Constructore_overloading 

{
	Constructore_overloading (int a , int b)
	{
		int sum = a+b;
		System.out.println(" print the value of sum => "+sum);
	}
	
	
	
	
	Constructore_overloading()
	{
		System.out.println(" Non para constructore with overloading");
	}
	
	Constructore_overloading (int e)
	{
		
		System.out.println(" print the value of passed => "+e);
	}
	public static void main (String [] args)
	{
		
		new Constructore_overloading(10,20);
		new Constructore_overloading();
		new Constructore_overloading(900);
		
	}
}
