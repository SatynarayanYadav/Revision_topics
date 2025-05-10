package C_methodas;

public class Main_method_overloading_non_static 

{
	public void main(int id)
	{
		System.out.println("Emp id = > "+id);
	}
	public void main(String name)
	{
		System.out.println("Emp name = > "+name);
	}
	public void main(String depaerment,String officename)
	{
		System.out.println("Emp department => "+depaerment);
		System.out.println("Emp officename => "+officename);
	}
	public void main(double salary)
	{
		System.out.println("Emp salary => "+salary);
	}
	
	
	public static void main(String[] args) 
    {
		System.out.println("Details of Emp");
		
		Main_method_overloading_non_static g1 = new Main_method_overloading_non_static();
		g1.main(201);
		g1.main("Satya");
		g1.main(35000.76);
		g1.main("Automation Test Engineer", "HCL.PVT.LTD");
	}
}
