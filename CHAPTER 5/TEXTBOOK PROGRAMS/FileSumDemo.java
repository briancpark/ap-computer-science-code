import java.io.*;

public class FileSumDemo
{
   public static void main(String[] args) throws IOException
   {
      FileSum fs = new FileSum("Numbers.txt");
      
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " +
                         fs.getSum());
   }
}
                          