//6. ShippingCharges Class

import java.util.Scanner;

public class ShippingChargesDemo
{
   public static void main(String[] args)
   {
      double packageWeight, packageMiles;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("What is the weight of the package (in kg)?: ");
      packageWeight = keyboard.nextDouble();
      System.out.print("How far is shipping (in miles)?: ");
      packageMiles = keyboard.nextDouble();
      
      //Create new object
      ShippingCharges user = new ShippingCharges(packageWeight, packageMiles);
      
      //Display shipping charges
      System.out.printf("Shipping Charges: $%.2f", user.shippingCharges());
   }
}      