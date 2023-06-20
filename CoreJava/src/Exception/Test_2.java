package Exception;

public class Test_2 {

	public static void main(String[] args)
	{

     try 
     {
    	 System.out.println("st1");
     }
     catch(Exception e) 
     {
    	 System.out.println(e);
    	 System.out.println(10/0);
     }
     
     
	}

}
