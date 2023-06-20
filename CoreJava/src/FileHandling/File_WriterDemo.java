package FileHandling;

import java.io.*;

public class File_WriterDemo {

	public static void main(String[] args) throws Exception
    {
		FileWriter f1 = new FileWriter("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\LC.txt");
         try {
        	 try 
        	 {
        		 f1.write("Java Programming is the best Lnaguage....!");
        	 }
			finally 
			{
				f1.close();
			}
		System.out.println("Succesfully Data Wrote in file!");
             } 
         
         catch (IOException e) 
         {
			System.out.println("File Already Exit");
			e.printStackTrace();
		}
	}

}

