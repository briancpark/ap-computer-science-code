//4. Software Sales

public class SoftwareSales
{
   private int numberOfUnitsSold;
   private final double PRICE = 99.0;
   
   public SoftwareSales(int n)
   {
      numberOfUnitsSold = n;
   }
   
   public void setNumberOfUnitsSold(int n)
   {
      numberOfUnitsSold = n;
   }
   
   public int getNumberOfUnitsSold()
   {
      return numberOfUnitsSold;
   }
   
   public double discount()
   {
      double discount = 0;
      double discountAmount = 0;
      
      if (numberOfUnitsSold >= 10 && numberOfUnitsSold <= 19)
         discount = .20;
      else if (numberOfUnitsSold >= 20 && numberOfUnitsSold <= 49)
         discount = .30;
      else if (numberOfUnitsSold >= 50 && numberOfUnitsSold <= 99)
         discount = .40;
      else if (numberOfUnitsSold >= 100)
         discount = .50;
      
      discountAmount = discount * PRICE * numberOfUnitsSold;
      
      return discountAmount;   
   }      
   
   public double totalCost()
   {
      double totalCost = 0, 
             discount = 0;
      
      totalCost = (numberOfUnitsSold * PRICE) - discount();
      
      return totalCost;
   }
}        
   
   
