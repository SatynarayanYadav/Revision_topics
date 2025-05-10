package h_Inheritance;
  // to call the parent class constructor from the child class constructor by inheriting concept 

class univercity
{
	univercity()
	{
		System.out.println("C.S.V.T.U univercity ");
	}
}

class collage extends univercity
{
     collage()
     {
    	 System.out.println("J.K.Institute of Engineering collage");
     }
}


public class Super_Calling extends collage
{
	Super_Calling()
    {
		//super();
    	System.out.println("Call all the constructor method values");
    }
	
	public static void main(String[] args) 
	{
		new Super_Calling();
	}
}
