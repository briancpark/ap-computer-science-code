import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args)
   {
      BankAccount account;
      double balance,
             interestRate,
             pay,
             cashNeeded;
             
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is you account's "
                        + "starting balance? ");
      balance = keyboard.nextDouble();
      
      System.out.print("What is your monthly interest rate? ");
      interestRate = keyboard.nextDouble();
      
      account = new BankAccount(balance, interestRate);
      
      System.out.print("How much were you paid this month? ");
      pay = keyboard.nextDouble();
      
      System.out.println("We will deposit your pay "
                        + "into your account.");
      
      account.deposit(pay);
      
      System.out.println("Yor current balance is $"
                        + account.getBalance());
      
      System.out.print("How much would you like "
                        + "to withdraw? ");
      
      cashNeeded = keyboard.nextDouble();
      account.withdraw(cashNeeded);
      
      account.addInterest();
      
      System.out.println("This month you have earned $"
                           + account.getInterest()
                           + " in interest.");
      System.out.println("Now you balance is $"
                        + account.getBalance());
   }
}                                                      
                                                            