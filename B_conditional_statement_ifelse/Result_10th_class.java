package B_conditional_statement_ifelse;

/*Suppose we need to assign different grades to students based on their scores.

If a student scores above 90, assign grade A.
If a student scores above 75, assign grade B.
If a student scores above 65, assign grade C.
*/

public class Result_10th_class 
{
    public static void main(String[] args) 
    {
	  int score =91;
	  
	  if(score>90)
	  {
		  System.out.println("student grade  A");
	  }	  
	  else if(score>75)
	  {
		  System.out.println("student grade  B");
	  }
	  else if(score>65)
	  {
		  System.out.println("student grade  C");
	  }
	  else
	  {
		  System.out.println("student failed");
	  }
	}
}
