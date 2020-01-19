//7. Quarterly Sales Statistics

import java.util.Scanner;

public class QuarterlySalesStatisticsDemo
{
   public static void main(String[] args)
   {
      final int DIVS = 6;
      final int QTRS = 4;
      double totalSales = 0.0;
      double averageSales, highSale = 0.0;
      
      double[][] sales = new double[DIVS][QTRS];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This program will calculate the " +
                         "total sales of");
      System.out.println("all the company's divisions. " +
                         "Enter the following sales data:");
      
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {  
            System.out.printf("Division %d, Quarter %d: $",
                              (div + 1), (qtr + 1));
            sales[div][qtr] = keyboard.nextDouble();
         }
         System.out.println();        
      }
   
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            totalSales += sales[div][qtr];
         }
      }
      
      averageSales = totalSales / DIVS;
      
      for (int d = 0; d < DIVS; d++)
      {
         for (int q = 0; q < QTRS; q++)
         {
            if (highSale < sales[d][q])
               highSale = sales[d][q];
         }
      }
   
      System.out.printf("Total company sales: $%,.2f\n" +
                        "Average sales per division: $%.2f\n" +
                        "Division with highest sales: $%.2f\n",
                        totalSales, averageSales, highSale); 
   }
}                        