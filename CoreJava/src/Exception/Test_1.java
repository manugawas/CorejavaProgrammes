package Exception;



public class Test_1 {

	public static void main(String[] args)
	{
		
		try 
		{
		System.out.println(10/2);
		System.exit(1);
		}
		catch(NullPointerException e) 
		{
		
		System.out.println("AirthmeticException");
		}
		
		finally 
		{
			System.out.println("Finally");
		}
	}

}
