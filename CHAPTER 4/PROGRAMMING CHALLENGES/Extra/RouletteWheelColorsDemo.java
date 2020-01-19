//18. Roulette Wheel Colors

import java.util.Scanner;

public class RouletteWheelColorsDemo
{
   public static void main(String[] args)
   {
      int userNumber;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Enter a pocket number (0-36): ");
      userNumber = keyboard.nextInt();
      
      RouletteWheelColors user = new RouletteWheelColors(userNumber);
      
      if (userNumber > 36 || userNumber < 0)
         System.out.println("Invalid pocket number.");
      else
         System.out.println("Pocket color is " + user.getPocketColor() + ".");
   }
}            
      
         