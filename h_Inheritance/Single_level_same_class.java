package h_Inheritance;

class a
{
      static void add()
      {
    	  int i = 20;
    	  int j = 30;
    	  int k = i+j;
    	  System.out.println("Addtion of two numbers => "+k);
      }
}


public class Single_level_same_class extends a

{
    void sub()
    {
    	double d = 10.20;
    	double e = 11.40;
    	double f = e-d;
    	System.out.println("subtraction of two numbers => "+f);
    }
    
    public static void main(String[] args) 
    {
	    add();
	    Single_level_same_class obj = new Single_level_same_class();
	    obj.sub();
	}
}
