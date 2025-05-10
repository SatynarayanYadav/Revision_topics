package h_Inheritance;

class test1
{
	void print1()
	{
		System.out.println("Print1");
	}
	static void print2()
	{
		System.out.println("Print2");

	}
}

class test2 extends test1
{
	void print3()
	{
		System.out.println("Print3");

	}
	
	static void print4()
	{
		System.out.println("Print4");

	}
}

public class Assignment_21_Multi_level_in_same_class extends test2
{
    
	void print5()
	{
		System.out.println("print5");
	}
	public static void main(String[] args) 
	{
		print2();
		print4();
		Assignment_21_Multi_level_in_same_class obj = new Assignment_21_Multi_level_in_same_class();
		obj.print1();
		obj.print3();
		obj.print5();
	}
}
