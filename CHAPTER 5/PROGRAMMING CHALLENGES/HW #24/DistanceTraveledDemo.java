//2. Distance Traveled

import java.util.Scanner;

public class DistanceTraveledDemo
{
   public static void main(String[] args)
   {
      int hours;
      double mph;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("How many hours did you travel?: ");
      hours = keyboard.nextInt();
      System.out.print("At what speed were you traveling in mph?: ");
      mph = keyboard.nextDouble();
      
      //Input validation for hours
      while (hours < 1)
      {
         System.out.println("Invalid number of hours. Please enter 1 hour or more.");
         System.out.print("How many hours did you travel?: ");  
         hours = keyboard.nextInt();
      }
      
      //Input validation for speed
      while (mph < 0)
      {
         System.out.println("Invald speed. Please enter positive speed.");
         System.out.print("At what speed were you traveling in mph?: ");
         mph = keyboard.nextDouble();
      }
      
      System.out.println("Hour             Distance Traveled");
      System.out.println("----------------------------------");
      
      //Display report for distance traveled per hour
      for (int count = 1; count <= hours; count++)
      {
         DistanceTraveled user = new DistanceTraveled(mph, count);
         
         System.out.printf("%d\t\t\t\t\t\t\t%.1f\n", count, user.getDistance());
      }   
   }
}      
      