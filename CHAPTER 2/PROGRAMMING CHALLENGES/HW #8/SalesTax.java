//7. Sales Tax

import java.util.Scanner;

public class SalesTax
{
   public static void main(String[] args)
   {
      final double stateSalesTax = .055;
      final double countySalesTax = .02;
      double stateSalesTaxAmount, countySalesTaxAmount, 
             purchaseAmount, totalSalesTax, saleTotal;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the amount of purchase?: $");
      purchaseAmount = keyboard.nextDouble();
      
      stateSalesTaxAmount = purchaseAmount * stateSalesTax;
      countySalesTaxAmount = purchaseAmount * countySalesTax;
      totalSalesTax = stateSalesTaxAmount + countySalesTaxAmount;
      saleTotal = purchaseAmount + totalSalesTax;
      
      System.out.printf("\n\nYour purchase amount is $%,.2f", purchaseAmount);
      System.out.printf("\n\nState Sales Tax:\t\t\t$%,.2f\nCounty Sales Tax:\t\t\t$%,.2f" +
                        "\nTotal Sales Tax:\t\t\t$%,.2f\n\nSale Total:\t\t\t\t\t$%,.2f",
                        stateSalesTaxAmount, countySalesTaxAmount, totalSalesTax, saleTotal);
   }
}                        
      
      