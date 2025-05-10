package C_methodas;

public class Assignment_9_3SM_3NSM_3Con_with_Para 
{
     void para1(int a ,int b)
     {
    	 int sum = a+b;
    	 System.out.println("Non static para addition value => "+sum);
     }
     void para2(double c , double d)
     {
    	 double sub = c-d;
    	 System.out.println("Non static para subtraction value => "+sub);
     }
     void para3(long e , long f)
     {
    	 long multi = e*f;
    	 System.out.println("Non static para multiple value => "+multi);
         System.out.println(" ============== Static method with para started ===============");
     }
     ///////////////// static method with para
     static void para4(int a ,int b)
     {
    	 int sum = a+b;
    	 System.out.println("static method with para addition value => "+sum);
     }
     static void para5(double c , double d)
     {
    	 double sub = c-d;
    	 System.out.println("static method with para subtraction value => "+sub);
     }
     static void para6(long e , long f)
     {
    	 long multi = e*f;
    	 System.out.println("static method with para multiple value => "+multi);
    	 
         
     }
     //// Constructore with para
     Assignment_9_3SM_3NSM_3Con_with_Para(int a , int b)
     {
    	 int sum = a+b;
    	 System.out.println("counstroctor with para addition value => "+sum);
     }
     Assignment_9_3SM_3NSM_3Con_with_Para(double c , double d)
     {
    	 double sub = c-d;
    	 System.out.println("counstroctor with para subtraction value => "+sub);
     }
     Assignment_9_3SM_3NSM_3Con_with_Para(String name , String sarname)
     {
    	 
    	 System.out.println("counstroctor with para multiple value => "+name);
    	 System.out.println("counstroctor with para multiple value => "+sarname);
     }
     
     public static void main(String[] args) 
     {
    	 // Calling constructor 
    	 System.out.println(" ============== counstroctore with para started ===============");
    	 Assignment_9_3SM_3NSM_3Con_with_Para ob1 = new Assignment_9_3SM_3NSM_3Con_with_Para(2,7);
    	 Assignment_9_3SM_3NSM_3Con_with_Para ob2 = new Assignment_9_3SM_3NSM_3Con_with_Para(100,30);
    	 Assignment_9_3SM_3NSM_3Con_with_Para ob3 = new Assignment_9_3SM_3NSM_3Con_with_Para("satya","Yadav");
    	 System.out.println(" ============== Non static method with para started ===============");
    	//calling non static methods
    	 ob1.para1(2, 3);
    	 ob1.para2(10.0, 4.35);
    	 ob1.para3(20,2);
    	 
    	  /// calling static methods
    	 para4(10, 12);
    	 para5(4.12, 2.01);
    	 para6(4, 5);
    	 
    	 
    	 

    	 
	}
}
