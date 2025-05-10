package h_Inheritance;

class Grand_parent
{
	Grand_parent(int a , int b)
	{
		int c = a+b;
		System.out.println("value of add => "+c);
	}
    	
}

class parent extends Grand_parent
{
	parent()
	{
		super(10,40);
		System.out.println("2");
	}
}

class child extends parent
{
	child(double d , double e)
	{
		double f= d-e;
		System.out.println("Value of subtra = > "+f);
	}
	
}
public class Super_Calling_Para extends child
{
	Super_Calling_Para()
	{
		super(20.12,30.99);
		System.out.println("Call the all above class consturctore values");
	}
	
	public static void main(String[] args) 
	{
		new Super_Calling_Para();
	}
}
