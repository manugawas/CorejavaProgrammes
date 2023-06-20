package Exception;

public class Test_3 {

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("hello");
			try {
				System.out.println(10/0);
				}
			catch(ArithmeticException e)
             {
				e.toString();
				System.out.println(e);
             }
			
		}
		finally 
		{
			System.out.println("Finally");
		}
	}

}
