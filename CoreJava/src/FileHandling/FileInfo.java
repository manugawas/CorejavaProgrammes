package FileHandling;

import java.io.*;

public class FileInfo {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\FH.txt");
        if(f.exists()) 
        {
        	System.out.println("File Name:"+f.getName());
        	System.out.println("File Location"+f.getAbsolutePath());
        	System.out.println("File Readable:"+f.canRead());
        	System.out.println("File Writeable:"+f.canWrite());
        	System.out.println("File Size:"+f.length());
        }
        else 
        {
        	System.out.println("File dosen't Exist!");
        }
	}

}
