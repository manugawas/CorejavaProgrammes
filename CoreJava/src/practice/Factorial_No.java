package practice;

import java.util.Scanner;

public class Factorial_No {

	public static void main(String[] args)
    {  System.out.println("Enter a no for factorial");
		Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int c;
         int fact = 1;
         if ( n < 0 )
        	 System.out.println("Number should be non-negative.");
        	 else
        	 {
        	 for ( c = 1 ; c <= n ; c++ )
        	 fact = fact*c;
        	 System.out.println("Factorial of "+n+" is = "+fact);
        	 }
    }
}
