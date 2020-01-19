//13. Restaurant Bill

import java.util.Scanner;

public class RestaurantBill
{
   public static void main(String[] args)
   {
      final double tax = .075, tip = .18;
      double mealCharge, taxAmount, tipAmount, totalBill;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the amount of the meal charge?: $");
      mealCharge = keyboard.nextDouble();
      
      taxAmount = mealCharge * tax;
      tipAmount = mealCharge * tip;
      
      totalBill = mealCharge + tipAmount + taxAmount;
      
      System.out.printf("Meal Charge:\t%,.2f\nTax Amount:\t\t%,.2f\nTip Amount:\t\t%,.2f" +
                        "\nTotal Bill:\t\t%,.2f\n", mealCharge, taxAmount, tipAmount, totalBill);
   }
}                                       
      
      