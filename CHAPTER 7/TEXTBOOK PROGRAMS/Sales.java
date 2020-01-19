import java.util.Scanner;
import java.text.DecimalFormat;

public class Sales
{
   public static void main(String[] args)
   {
      final int ONE_WEEK = 7;
      
      double[] sales = new double[ONE_WEEK];
      
      getValues(sales);
      
      SalesData week = new SalesData(sales);
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      System.out.println();
      System.out.println("The total sales were $"
                     + dollar.format(week.getTotal()));
      System.out.println("The average sales were $"
                     + dollar.format(week.getAverage()));
      System.out.println("The highest sales were $"
                     + dollar.format(week.getHighest()));
      System.out.println("The lowest sales were $"
                     + dollar.format(week.getLowest()));   
   }
   
   public static void getValues(double[] array)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the sales for each of "
                         + "the following days.");
                         
      for (int index = 0; index < array.length; index++)
      {
         System.out.print("Day " + (index + 1) + ": ");
         array[index] = keyboard.nextDouble();
      }
   }
}                                                                                              