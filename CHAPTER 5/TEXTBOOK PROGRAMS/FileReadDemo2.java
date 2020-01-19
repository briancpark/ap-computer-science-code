import java.util.Scanner;
import java.io.*;

public class FileReadDemo2
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
      
      File file = new File(filename);
      if (!file.exists())
      {
         System.out.println("The file " + filename +
                            " does not exist.");
         
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      while (inputFile.hasNext())
      {
         String friendName = inputFile.nextLine();
         
         System.out.println(friendName);
      }
      
      inputFile.close();
   }
}                               