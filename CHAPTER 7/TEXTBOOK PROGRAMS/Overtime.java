import java.util.Scanner;
import java.text.DecimalFormat;

public class Overtime
{
   public static void main(String[] args)
   {
      final int NUM_EMPLOYEES = 5;
      double payRate,
             grossPay,
             overtime;
   
      int[] hours = new int[NUM_EMPLOYEES];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the hours worked by " +
                     NUM_EMPLOYEES + " employees who " +
                     "all earn the same hourly rate.");
      
      for (int index = 0; index < NUM_EMPLOYEES; index++)
      {
         System.out.print("Employee #" +  (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }
      
      System.out.print("Enter the hourly rate for "
                     + " each employee: ");
      payRate = keyboard.nextInt();
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      System.out.println("Here is the gross pay for "
                          + "each employee:");
      for (int index = 0; index < NUM_EMPLOYEES; index++)
      {
         if (hours[index] > 40)
         {
            grossPay = 40 * payRate;
            
            overtime = (hours[index] - 40) * (1.5 * payRate);
            
            grossPay += overtime;
         }
         else
            grossPay = hours[index] * payRate;
         
         System.out.println("Employee #" + (index + 1)
                        + ": $" + dollar.format(grossPay));
      }
   }
}                                                                                           