//15.Ingredient Adjuster

import java.util.Scanner;

public class IngredientAdjuster
{
   public static void main(String[] args)
   {
      final double sugarCups = 1.5, butterCups = 1, flourCups = 2.75, cookies = 48, 
                   sugarCupsPerCookie, butterCupsPerCookie, flourCupsPerCookie;
      double userCookies, userSugarCups, userButterCups, userFlourCups;             
      
      sugarCupsPerCookie = sugarCups / cookies;   
      butterCupsPerCookie = butterCups / cookies;
      flourCupsPerCookie = flourCups / cookies;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many cookies do you want to make?: ");
      userCookies = keyboard.nextDouble();
      
      userSugarCups = userCookies * sugarCupsPerCookie;
      userButterCups = userCookies * butterCupsPerCookie;
      userFlourCups = userCookies * flourCupsPerCookie;
      
      System.out.printf("Ingredients needed:\n\n%10.2f cups of sugar\n" +
                        "%10.2f cups of butter\n%10.2f cups of flour\n", 
                        userSugarCups, userButterCups, userFlourCups);
   }
}                        
      
      
      