import java.util.Scanner;
import java.io.*;

public class FileSum
{
   private double sum;
   
   public FileSum(String filename) throws IOException
   {
      String str;
      
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      sum = 0.0;
      
      while (inputFile.hasNext())
      {
         double number = inputFile.nextDouble();
         
         sum = sum + number;
      }
      
      inputFile.close();
   }
   
   public double getSum()
   {
      return sum;
   }
}            