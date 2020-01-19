import java.util.Scanner;
import java.text.DecimalFormat;

public class HalsCommission
{
   public static void main(String[] args)
   {
      double sales,
             advancePay;
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      DecimalFormat percent = new DecimalFormat("#0%");
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This program will display a "
                         + "pay report for a salesperson.");
      System.out.println("Enter the following information:");
      
      System.out.print("Amount of sales: $");
      sales = keyboard.nextDouble();
      System.out.print("Amount of advanced pay: $");
      advancePay = keyboard.nextDouble();
      
      SalesCommission payInfo =
              new SalesCommission(sales, advancePay);
      
      System.out.println("\nPay Report");
      System.out.println("-------------------------");
      System.out.println("Sales: $"
               + dollar.format(payInfo.getSales()));  
      System.out.println("Commission rate: "
               + percent.format(payInfo.getRate()));
      System.out.println("Commission: $"
               + dollar.format(payInfo.getCommission()));   
      System.out.println("Advanced pay: $"
               + dollar.format(payInfo.getAdvance()));
      System.out.println("Remaining pay: $"
               + dollar.format(payInfo.getPay()));   
   }
}                                                                                             