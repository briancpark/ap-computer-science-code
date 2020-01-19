//5. Cookie Calories

import java.util.Scanner;

public class CookieCalories
{
   public static void main(String[] args)
   {
      final double cookies = 40;
      final double servings = 10;
      final double calories = 300;
      final double caloriesPerCookie;
      double eat, caloriesAte;
      
      caloriesPerCookie = calories / (cookies / servings);     //Calories per cookie- Should equal 4
            
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many cookies have you ate? :");
      eat = keyboard.nextDouble();
      
      caloriesAte = eat * caloriesPerCookie;                   
      
      System.out.printf("\nYou have consumed %,.2f calories!\n", caloriesAte);
   }
}      