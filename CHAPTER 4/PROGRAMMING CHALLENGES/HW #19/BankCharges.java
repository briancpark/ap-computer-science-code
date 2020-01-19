//5. BankCharges Class

public class BankCharges
{
   private final double CHARGE_PER_MONTH = 10.0;
   private final double LOW_BALANCE_FEE = 15.0;
   private final double LOW_BALANCE = 400.0;
   private int checks;
   private double balance;
   
   //Constructor
   public BankCharges(int c, double b)
   {
      checks = c;
      balance = b;
   }
   
   //Mutator methods
   public void setChecks(int c)
   {
      checks = c;
   }
   
   public void setBalance(double b)
   {
      balance = b;
   }   
   
   //Accessor methods
   public int getChecks()
   {
      return checks;
   }
   
   public double getBalance()
   {  
      return balance;
   }   
   
   //Method for calculating check fee
   public double checkFeeAmount()
   {  
      //Initialize check fee with the charge per month ($10)
      double checkFee = CHARGE_PER_MONTH;
      
      //If statement that adds $15 to check fee if balance is low
      if (balance < LOW_BALANCE)
         checkFee += balance + LOW_BALANCE_FEE;
      
      /*If-else-if statments testing for the quantity discounts
      and adding it to the check fee*/   
      if (checks < 20)
         checkFee += checks * .1;
      else if (checks >= 20 && checks <= 29)
         checkFee += checks * .08;
      else if (checks >= 40 && checks <= 59)
         checkFee += checks * .06;
      else
         checkFee += checks * .04;
         
      return checkFee;
   }
}         
                     
        