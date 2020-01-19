import java.util.ArrayList;
import java.util.Scanner;

public class RainfallTester
{
   public static void main(String[] args)
   {
      double[] rain = new double[12];
      
      Scanner keyboard = new Scanner(System.in);
      
      for (int i = 0; i < rain.length; i++)
      {
         System.out.print("Amount of rainfall for month " + (i + 1) + ": ");
         rain[i] = keyboard.nextDouble();
         
         while (rain[i] < 0)
         {
            System.out.println("Invalid input. Please enrer a positive value.");
            System.out.print("Amount of rainfall for month " + (i + 1) + ": ");
            rain[i] = keyboard.nextDouble();
         }
      }
      
      Rainfall rf = new Rainfall(rain);
      
      System.out.println("Total rainfall: " + rf.getTotalRainFall());
      System.out.println("Greatest rainfall: " + rf.getHighestMonth());
      System.out.println("Least rainfall: " + rf.getLowestMonth());
      System.out.println("Average rainfall: " + rf.getAverageRainfall());    
   }
}       