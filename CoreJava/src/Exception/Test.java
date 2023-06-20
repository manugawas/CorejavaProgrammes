package Exception;

public class Test {

	public static void main(String[] args) 
	{
		 dostuff();
		try
		{
			System.out.println(10/0);
			}
		catch(Exception e) 
		{
			System.out.println(e);
		}
			
		
	}
     public static void dostuff() 
     {
    	domorestuff();
    	System.out.println("Hi");
     }
     public static void domorestuff() 
     {
    	 System.out.println("Hello");
     }
}
