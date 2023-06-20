package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_FileDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\LC.txt");
		
		FileOutputStream w = new FileOutputStream("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\New.txt");
		
		int i;
		while((i=f.read())!=-1) 
		{
			w.write((char)i);
		}
		
		System.out.println("Data copied Successfully..!");
		
	}

}
