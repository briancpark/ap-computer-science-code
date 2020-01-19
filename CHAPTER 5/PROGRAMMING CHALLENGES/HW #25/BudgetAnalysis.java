//16. Budget Analysis

import java.util.Scanner;

public class BudgetAnalysis
{
   public static void main(String[] args)
   {
      double budgetMonth, budgetSpent, budgetTotal = 0.0;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Enter the amount you have budgeted this month: $");
      budgetMonth = keyboard.nextDouble();
      System.out.println("Enter your expenses for the month.");
      System.out.println("Enter 0 or a negative number when you are done entering");
      System.out.println("#######################################################");
      
      
      do
      {
         budgetSpent = keyboard.nextDouble();
         budgetTotal += budgetSpent;
      } while (budgetSpent > 0);
      
      if (budgetTotal > budgetMonth)
      {
         double overBudget;
         overBudget = budgetTotal - budgetMonth;
         System.out.printf("You are $%.2f over budget.", overBudget);
      }
      else if (budgetMonth > budgetTotal)
      {
         double underBudget;
         underBudget = budgetMonth - budgetTotal;
         System.out.printf("You are $%.2f under budget.", underBudget); 
      }
      else
      {
         System.out.println("You used exactly all of your budget.");
      }       
   }
}      