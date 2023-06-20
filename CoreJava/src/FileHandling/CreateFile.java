package FileHandling;

import java.io.*;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args)
	{   
		File f = new File("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\FH.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("New File is Created!!");
			}
			else {
				System.out.println("File Already Exist!");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
