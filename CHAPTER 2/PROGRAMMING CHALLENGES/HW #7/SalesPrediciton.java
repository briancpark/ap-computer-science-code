//6. Sales Prediciton

public class SalesPrediciton
{
   public static void main(String[] args)
   {
      double percent = .65;
      double sales = 8.3E6;
      double salePredict;
      
      salePredict = sales * percent;
      
      System.out.printf("The predicted sale division of the East Coast is $%,.2f", salePredict);
   }
}      