//7. FatGram Class

import java.util.Scanner;

public class FatGramDemo
{
   public static void main(String[] args)
   {
      double userCalories, userFatGrams;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the number of calories in food: ");
      userCalories = keyboard.nextDouble();
      System.out.print("Enter the number of fat grams in food: ");
      userFatGrams = keyboard.nextDouble();
      
      FatGram user = new FatGram(userCalories, userFatGrams);
      
      System.out.printf("Percentage of calories coming from fat: %.2f\n%s%s",
                        user.percentageFat(), user.warningMessage(), user.invalidNumbers());
   }
}      