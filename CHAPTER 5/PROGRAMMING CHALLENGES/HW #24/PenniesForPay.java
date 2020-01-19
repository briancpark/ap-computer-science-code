//4. Pennies for Pay

import java.util.Scanner;

public class PenniesForPay
{
   public static void main(String[] args)
   {
      int days, salaryPerDay = 1; 
      double totalPay = 0; 
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("How many days have you worked?: ");
      days = keyboard.nextInt();
      
      //Input validation
      while (days < 1)
      {
         System.out.println("Invalid number of days. Please enter more 1 or more.");
         System.out.print("How many days have you worked?: ");
         days = keyboard.nextInt();
      }
      
      System.out.println("Days            Salary");
      System.out.println("----------------------");
      
      //Table displaying salary each day
      
      for (int count = 1; count <= days; count++)
      {
         double salaryPerDayDollars = salaryPerDay / 100.0;
         System.out.printf("%d\t\t\t\t%.2f\n", count, salaryPerDayDollars);
         totalPay += salaryPerDayDollars;
         salaryPerDay *= 2;
      }
      
      //Display total amount
      System.out.println("\nYour total pay is $" + totalPay);
   }
}         
         