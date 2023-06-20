package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_ReaderDemo {

	public static void main(String[] args) throws IOException 
	{
		try {
			FileReader fr = new FileReader("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\LC.txt");
		    try{
		    	int i;
		    while((i=fr.read())!=-1)
		        {
		    	System.out.print((char)i);
		    	}
		    }
		    finally 
		    {
		    fr.close();	
		    System.out.println("File closed");
		    }
		    
		}
		catch (FileNotFoundException e)
		    {
			
			e.printStackTrace();
		    }
		
		

		}

}
		
		
