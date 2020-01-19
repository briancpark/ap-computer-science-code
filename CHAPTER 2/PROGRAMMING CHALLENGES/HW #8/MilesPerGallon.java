//9. Miles-per-Gallon

import java.util.Scanner;

public class MilesPerGallon
{
   public static void main(String[] args)
   {
      double milesDriven, gallonsUsed, milesPerGallon;
            
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the number of miles driven?: ");
      milesDriven = keyboard.nextDouble();
      
      System.out.print("What is the gallons of gas used?: ");
      gallonsUsed = keyboard.nextDouble();
      
      milesPerGallon = milesDriven / gallonsUsed;
      
      System.out.printf("\nMiles per gallon is %,.2f", milesPerGallon);
   }
}      