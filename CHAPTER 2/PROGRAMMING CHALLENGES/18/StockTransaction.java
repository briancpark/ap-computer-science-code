//18. Stock Transaction Program

public class StockTransaction
{
   public static void main(String[] args)
   {
      final int sharesPurchased = 1000;
      final double pricePerShare = 32.87, commission = .02;
      double amountPaid, commissionAmount, profit;
      
      amountPaid = sharesPurchased * pricePerShare;
      commissionAmount = amountPaid * commission;
      
      final int sharesSold = 1000;
      final double priceSoldPerShare = 33.92, commissionSold = .02;
      double amountSold, commissionSoldAmount;      //2nd commission amount paid for selling
      
      amountSold = sharesSold * priceSoldPerShare;
      commissionSoldAmount = amountSold * commissionSold;
      
      profit = amountSold - amountPaid - commissionAmount - commissionSoldAmount;
      
      System.out.printf("Amount of money Joe paid for the stock: $%,.2f\n" +
                        "Amount of commission Joe paid his broker when he bought the stock: $%,.2f\n" +
                        "Amount of money Joe sold the stock for: $%,.2f\n" +
                        "Amount of commission Joe paid his broker when he sold the stock: $%,.2f\n" +
                        "Profit that Joe made: $%,.2f\n", amountPaid, commissionAmount, amountSold,
                        commissionSoldAmount, profit);
   }
}                        
      
      