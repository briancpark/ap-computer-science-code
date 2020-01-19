//4. LandTract Class

import java.util.Scanner;

public class LandTractDemo
{
   public static void main(String[] args)
   {
      double length, width;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for info
      System.out.println("Tract 1: ");
      System.out.print("Enter length (in ft): ");
      length = keyboard.nextDouble();
      System.out.print("Enter width (in ft): ");
      width = keyboard.nextDouble();
      
      LandTract tract1 = new LandTract(length, width);
      
      System.out.println("Tract 2: ");
      System.out.print("Enter length (in ft): ");
      length = keyboard.nextDouble();
      System.out.print("Enter width (in ft): ");
      width = keyboard.nextDouble();
      
      LandTract tract2 = new LandTract(length, width);
      
      //Display info
      System.out.println("Tract 1: " + tract1 + "\nTract 2: " + tract2);
         
      if (tract1.equals(tract2))
         System.out.println("Both tracts are the same size.");
      else
         System.out.println("Both tracts are not the same size.");
   }
}         