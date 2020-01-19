//14. Stock Commission

public class StockCommission
{
   public static void main(String[] args)
   {
      double stock, commissionAmount, totalAmount;
      final double shares = 1000, pricePerShare = 25.50, commission = .02;
      
      stock = shares * pricePerShare;
      
      commissionAmount = stock * commission;
      
      totalAmount = stock + commissionAmount;
      
      System.out.printf("Amount paid for the stock alone(without the commission): $%,.2f\n" + 
                        "Amount of the commission: $%,.2f\nTotal amount paid" + 
                        "(for the stock plus the commission): $%,.2f\n", 
                        stock, commissionAmount, totalAmount);
   }
}                        
                        