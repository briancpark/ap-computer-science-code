//14. Days In a Month

import java.util.Scanner;

public class DaysInAMonthDemo
{
   public static void main(String[] args)
   {
      int inputMonth, inputYear;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Enter a month (1-12): ");
      inputMonth = keyboard.nextInt();
      System.out.print("Enter a year: ");
      inputYear = keyboard.nextInt();
      
      //Create new object
      DaysInAMonth user = new DaysInAMonth(inputMonth, inputYear);
      
      //Display number of days in the month
      if (inputMonth > 12 || inputMonth < 1)
         System.out.println("Error. Invalid month.");
      else
         System.out.println(user.getNumberOfDays() + " days");
   }
}            