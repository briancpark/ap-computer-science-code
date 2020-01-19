//8. CashRegister Class

import java.util.Scanner;

public class CashRegisterDemo
{
   public static void main(String[] args)
   {
      int userQuantity;
      
      RetailItem item = new RetailItem("Candy bar", 17789,                  
                                       0.75, 1.5);
      
      Scanner keyboard = new Scanner(System.in);                                 
      
      //Ask user for info
      System.out.print("What is the quantity of items being purchased?: ");
      userQuantity = keyboard.nextInt();
      
      CashRegister user = new CashRegister(item, userQuantity);
      
      //Display info
      System.out.printf("Sale's Subtotal: $%.2f\n" +
                        "Amount of Sales Tax: $%.2f\n" +
                        "Total: $%.2f",
                        user.getSubtotal(), user.getTax(), 
                        user.getTotal());
   }
}                           