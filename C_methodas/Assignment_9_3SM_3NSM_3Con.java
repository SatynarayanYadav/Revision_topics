package C_methodas;

public class Assignment_9_3SM_3NSM_3Con 
{
  
	
	
	static void test1()
	{
		System.out.println(" static method1 ");
	}
	static void test2()
	{
		System.out.println(" static method2 ");
	}
	static void test3()
	{
		System.out.println(" static method3 ");
		System.out.println("==============================");
		
	}
	
	void add1()
	{
		System.out.println(" Non static method1 ");
	}
	void add2()
	{
		System.out.println(" Non static method2 ");
	}
	void add3()
	{
		System.out.println(" Non static method3 ");
		System.out.println("============================");

	}
	
	
	Assignment_9_3SM_3NSM_3Con()
	{
		System.out.println("Constuctore 1");
	}
	Assignment_9_3SM_3NSM_3Con(String name)
	{
		System.out.println("Constuctore 2");
	}
	Assignment_9_3SM_3NSM_3Con(long Mo_no)
	{
		System.out.println("Constuctore 3");
	}
	public static void main(String[] args) 
	{
		
		test1();
		test2();
		test3();
		Assignment_9_3SM_3NSM_3Con n1 = new Assignment_9_3SM_3NSM_3Con();
		n1.add1();
		n1.add2();
		n1.add3();
		Assignment_9_3SM_3NSM_3Con n2 = new Assignment_9_3SM_3NSM_3Con();
		Assignment_9_3SM_3NSM_3Con n3 = new Assignment_9_3SM_3NSM_3Con("satya");
		Assignment_9_3SM_3NSM_3Con n4 = new Assignment_9_3SM_3NSM_3Con(9876545456l);
	}
}
