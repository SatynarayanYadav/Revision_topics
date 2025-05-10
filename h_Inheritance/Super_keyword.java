package h_Inheritance;


class studentname
{
  void details()
  {
	 
	 System.out.println("Student name is satya");
	  
  }
  
}
class rollnumber extends studentname
{
	 void details(String roll)
	  {
		  System.out.println("Student Roll No => "+roll);
		  super.details();
	  }
}
class classname extends rollnumber
{
	 void details(String s)
	  {   super.details("512");
		  System.out.println("Classname => "+s);
	  }
}

public class Super_keyword extends classname
{
	 void details()
	  {
		  System.out.println("Please check is student details are wright ");
		  super.details("10th");
	  }
	 
	 public static void main(String[] args) 
	{
		 Super_keyword  stu = new Super_keyword();
		 stu.details();
	}
}
