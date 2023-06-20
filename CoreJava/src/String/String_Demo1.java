package String;

public class String_Demo1 {

	public static void main(String[] args) 
	{
		String s1 = new String("Durga");  
		String s2 = new String("Durga");
		System.out.println(s1==s2); // for reference 
		System.out.println(s1.equals(s2)); //for content
		System.out.println("========================================================");
		
		StringBuffer sb1 = new StringBuffer("samu");
		StringBuffer sb2 = new StringBuffer("samu");
		System.out.println(sb1==sb2); // for reference 
		System.out.println(sb1.equals(sb2));//for reference
	}

}
