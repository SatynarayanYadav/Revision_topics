package C_methodas;

public class Main_method_overloading 
{
    
	public static void main()
	{
		System.out.println("id = > 1");
	}
	public static void main(String name)
	{
		System.out.println("name = > "+name);
	}
	
	public static void main(double salary)
	{
		System.out.println("Salary = > "+salary);
	}
	
	public static void main(String[] args) 
    {
		main();
		main("satya");
		main(20500);
	}
}
