package h_Inheritance;

// this keyword in java we use to assign the local variable values to the global variables 
public class This_Keyword 
{
   int id;
   String name;
   double salary;
   
   void student(int id, String name, double salary)
   {
	   System.out.println("Student Details");
	   System.out.println("-----------------");
	   
	   this.id = id;
	   this.name = name;
	   this.salary = salary;
   }
   
   public static void main(String[] args) 
   {
	   This_Keyword s1 = new This_Keyword();
	   s1.student(23, "satya", 3520.44);
	   System.out.println("Student id => "+s1.id);
	   System.out.println("Student name => "+s1.name);
	   System.out.println("Student salary => "+s1.salary);

   }
}
