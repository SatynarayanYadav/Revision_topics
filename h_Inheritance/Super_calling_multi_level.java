package h_Inheritance;


class grand_parent1
{
	grand_parent1(String name)
	{
		System.out.println("peint the name => "+name);
	}
}

class parent1 extends grand_parent1
{
	parent1()
	{
		super("Satya");
		System.out.println("2");
	}
	
}

class child1 extends parent1
{
	child1()
	{
		System.out.println("3");
	}
	}

public class Super_calling_multi_level extends child1
{
	Super_calling_multi_level()
	{ 
		
		System.out.println("Main method");
	}
    
	public static void main(String[] args) 
	{
		new Super_calling_multi_level();
	}
	 
}
