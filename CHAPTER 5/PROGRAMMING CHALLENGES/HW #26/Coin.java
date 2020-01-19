//21. Tossing Coins for a Dollar

import java.util.Random;

public class Coin
{
   private String sideUp;
   
   public Coin()
   {
      toss();
   }
   
   public void toss()
   {
      Random num = new Random();
      
      int number = num.nextInt(2);
      
      if (number == 0)   
         sideUp = "heads";
      else
         sideUp = "tails";
   }
   
   public String getSideUp()
   {
      return sideUp;
   }
}            