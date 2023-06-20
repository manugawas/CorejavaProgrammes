package practice;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String 1");
		s1= sc.nextLine();
		System.out.println("Enter String 2");
		s2= sc.nextLine();
		
		if(s1.compareTo(s2)>0)
			System.out.println("First string is greater than second.");
		else if(s1.compareTo(s2)<0)
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are Equal.");
		
		
		
	}

}
