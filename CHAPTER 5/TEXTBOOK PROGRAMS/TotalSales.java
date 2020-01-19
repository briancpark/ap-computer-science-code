import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalSales
{
   public static void main(String[] args)
   {
      int days;
      double sales;
      double totalSales;
      
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat dollar = 
                    new DecimalFormat("#,#0.00");
      
      System.out.print("For how many days do you have "
                       + "sales figures? ");
      days = keyboard.nextInt();
      
      totalSales = 0.0;
      
      for (int count = 1; count <= days; count++)
      {
         System.out.print("Enter the sales for day "
                          + count + ": ");
         sales = keyboard.nextDouble();
         totalSales += sales;
      }
      
      System.out.println("The total sales are $"
                         + dollar.format(totalSales));
   }
}                                                                               