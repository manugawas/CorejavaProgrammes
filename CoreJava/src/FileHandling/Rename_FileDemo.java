package FileHandling;

import java.io.File;

public class Rename_FileDemo {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\output.txt");
		File r = new File("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\input.txt");
	
	if(f.exists()) 
	{
		System.out.println(f.renameTo(r));
	}

	else 
	{
		System.out.println("File does not Exit");
	}
	
	
	
	
	}

}
