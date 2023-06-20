package practice;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) 
	{    System.out.println("Enter a no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		int temp;
		temp=n;
		while(n!=0) 
		{
		    rev = rev*10;
			rev=rev+n%10;
			n=n/10;
		}
	System.out.println("Reverse of entered no is :"+rev);	
       if(rev==temp) 
       
    	   System.out.println("Given no is palindrom of no");
       
       else 
       
    	   System.out.println("Not a plaindrom no.");
       
	
	
	}

}
