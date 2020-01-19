import java.util.Scanner;
import java.text.DecimalFormat;

public class StockTrader
{
   public static void main(String[] args)
   {
      int sharesToBuy;
      
      Stock xyzCompany = new Stock("XYZ", 9.62);
      
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      System.out.println("XYZ Company's stock is currently $"
                     + dollar.format(xyzCompany.getSharePrice())
                     + " per share.");
      
      System.out.print("How many shares do you want to buy? ");
      sharesToBuy = keyboard.nextInt();
      
      StockPurchase buy = 
               new StockPurchase(xyzCompany, sharesToBuy);
      
      System.out.println("Cost of the stock: $"
                         + dollar.format(buy.getCost()));
   }
}                                                 