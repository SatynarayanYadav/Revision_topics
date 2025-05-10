package C_methodas;

class A
{
	 void log()
	 {
		 System.out.println("1");
	 }
}

class B extends A
{
	void log()
	 {
		 super.log();
		 System.out.println("2");
		 
	 }
}

class C extends B
{
	void log()
	 {
		super.log();
		 System.out.println("3");
	 }
}
public class Method_Overriding_A_super_keyword extends C
{
	void log()
	 {
		
		 int a =1;
		 int b =2;
		 int c =a+b;
		 super.log();
		 System.out.println("Value of C => "+c);
		 
	 }
	
	public static void main(String[] args) 
	{
		Method_Overriding_A_super_keyword b1= new Method_Overriding_A_super_keyword();
		b1.log();
	}
}
