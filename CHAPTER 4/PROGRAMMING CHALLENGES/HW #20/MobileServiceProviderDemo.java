//11. Mobile Service Provider

import java.util.Scanner;

public class MobileServiceProviderDemo
{
   public static void main(String[] args)
   {
      String packageType;
      double minutesUsed;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Which package did you purchase? A, B, or C?: ");
      packageType = keyboard.nextLine();
      System.out.print("How many minutes were used?: ");
      minutesUsed = keyboard.nextDouble();
      
      //Create new object
      MobileServiceProvider user = new MobileServiceProvider(packageType, minutesUsed);
      
      //Display information
      System.out.printf("Your monthly bill is $%.2f", user.totalCharges());
   }
}      