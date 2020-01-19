//7. Quarterly Sales Statistics

public class Divisions
{
   private final int DIVISIONS = 6;
   private final int QUARTERS = 4;
   private double[][] sales = new double[DIVISIONS][QUARTERS];
   
   public void setSales(int div, int qtr, double amount)
   {
      sales[div - 1][qtr - 1] = amount;
   }            
   
   public double getSales(int div, int qtr)
   {
      return sales[div - 1][qtr - 1];
   }   
   
   public double totalQuarterSales(int quarter)
   {
      double total = 0;
      
      for (int row = 0; row < DIVISIONS; row++)
         total += sales[row][quarter-1];
         
      return total;
   }
   
   public double getQuarterlyIncrease(int div, int qtr)
   {
      double inc;
      
      inc = sales[div-1][qtr-1] - sales[div-1][qtr-2];
      
      return inc;
   } 
}    