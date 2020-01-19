//9. The Speed of Sound

import java.util.Scanner;

public class TheSpeedOfSoundDemo
{
   public static void main(String[] args)
   {
      double feetDistance, time;
      String material;      
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Is it traveling through air, water, or steel?: ");
      material = keyboard.nextLine();
      
      System.out.print("What is the distance of the sound wave in feet?: ");
      feetDistance = keyboard.nextDouble();
      
      //Create new object
      TheSpeedOfSound user = new TheSpeedOfSound(feetDistance);
      
      //Test condition for type of material
      if (material.equalsIgnoreCase("air"))
         time = user.getSpeedInAir();
      else if (material.equalsIgnoreCase("water"))
         time = user.getSpeedInWater();
      else if (material.equalsIgnoreCase("steel"))
         time = user.getSpeedInSteel();
      else
      {
         System.out.print("Error. Invalid input. \n"); 
         time = 0.0;
      }     
      
      //Display information
      System.out.printf("The time it takes for a sound wave to travel in %s " +
                        "is %f seconds.", material, time);
   }
}                        