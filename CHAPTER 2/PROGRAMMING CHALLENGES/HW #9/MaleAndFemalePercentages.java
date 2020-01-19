//11. Male and Female Percentages

import java.util.Scanner;

public class MaleAndFemalePercentages
{
   public static void main(String[] args)
   {
      int females, males;
      double total, malePercentage, femalePercentage;
      
      Scanner keyboard = new Scanner(System.in);
     
      System.out.print("How many males are in the class?: ");
      males = keyboard.nextInt();
      
      System.out.print("How many females are in the class?: ");
      females = keyboard.nextInt();
      
      total = males + females;
      
      malePercentage = (males / total) * 100;
      femalePercentage = (females / total) * 100;
      
      System.out.printf("\nPercentage of males:\t\t\t%.2f\nPercentage of females:\t\t%.2f",
                        malePercentage, femalePercentage);
   }
}                        
      
      