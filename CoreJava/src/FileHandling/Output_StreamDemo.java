package FileHandling;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Output_StreamDemo {

  public static void main(String args[]) {

    String data = "This is a line of text inside the file.";

    try {
      // Creates a FileOutputStream
      FileOutputStream file = new FileOutputStream("C:\\Users\\Manaswini S Gawas\\OneDrive\\Desktop\\java programs\\output.txt");

      // Creates an OutputStreamWriter
      OutputStreamWriter output = new OutputStreamWriter(file);

      // Writes string to the file
      output.write(data);
     

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}