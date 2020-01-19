//4. Software Sales

import java.util.Scanner;

public class SoftwareSalesDemo
{
   public static void main(String[] args)
   {
      int unitsPurchased;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the number of units sold?: ");
      unitsPurchased = keyboard.nextInt();
      
      SoftwareSales sales = new SoftwareSales(unitsPurchased);
      
      System.out.printf("Number of units sold: %d units \n" +
                        "Discount: $%.2f\n" + 
                        "Total cost: $%.2f\n", 
                        sales.getNumberOfUnitsSold(), sales.discount(),
                        sales.totalCost());                                             
   }
}      