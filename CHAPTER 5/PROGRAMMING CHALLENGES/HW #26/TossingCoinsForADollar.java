//21. Tossing Coins for a Dollar

public class TossingCoinsForADollar
{
   public static void main(String[] args)
   {
      double balance = 0.0;
      final double QUARTER = .25, DIME = .10, NICKEL = .05;
      
      //Create instances of each coin
      Coin quarter = new Coin();
      Coin dime = new Coin();
      Coin nickel = new Coin();
      
      //Loop that adds amount of coin to balance if it lands on heads
      //Stops when it reaches $1 or more
      while (balance < 1.00)
      {
         if (quarter.getSideUp().equals("heads"))
            balance += QUARTER;
         if (dime.getSideUp().equals("heads"))
            balance += DIME;
         if (nickel.getSideUp().equals("heads"))
            balance += NICKEL;   
      }
      
      //Display results
      if (balance == 1.00)
         System.out.printf("You win! Your balance is $%.2f", balance);
      else
         System.out.printf("You lose... Your balance is $%.2f", balance);
   }
}            