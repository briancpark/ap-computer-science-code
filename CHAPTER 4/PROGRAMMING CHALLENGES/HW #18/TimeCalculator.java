//2. Time Calculator

import java.util.Scanner;

public class TimeCalculator
{
   public static void main(String[] args)
   {
      double seconds;
      
      final double SECONDS_PER_MINUTE = 60,
                   SECONDS_PER_HOUR = 3600,
                   SECONDS_PER_DAY = 86400;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter number of seconds: ");
      seconds = keyboard.nextDouble();
      
      if (seconds >= 60)
      {
         double minutes = seconds / SECONDS_PER_MINUTE;
         System.out.println("There are " + minutes + " minutes in " +
                            seconds + " seconds.");
      }
      else if (seconds >= 3600)
      {
         double hours = seconds / SECONDS_PER_HOUR;
         System.out.println("There are " + hours + " hours in " +
                            seconds + " seconds.");
      }
      else if (seconds >= 86400)
      {
         double days = seconds / SECONDS_PER_DAY;
         System.out.println("There are " + days + " days in " +
                            seconds + " seconds.");
      }
      else
      {
         System.out.println("There are " + seconds + " seconds in " +
                            seconds + " seconds.");                       
      }
   }
}                                       
      