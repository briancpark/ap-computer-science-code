//5. BankCharges Class

import java.util.Scanner;

public class BankChargesDemo
{
   public static void main(String[] args)
   {
      int userChecks;
      double userBalance;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("What is the number of checks you have written?: ");
      userChecks = keyboard.nextInt();
      System.out.print("What is your account balance?: $");
      userBalance = keyboard.nextDouble();
      
      //Create new object
      BankCharges user = new BankCharges(userChecks, userBalance);
      
      //Display check fee amount
      System.out.printf("Check Fees: %.2f\n", user.checkFeeAmount());
   }
}                        