//3. Charge Account Validation

import java.util.Scanner;

public class ChargeAccountValidationDemo
{
   public static void main(String[] args)
   {
      int valid[] = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                      8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                      1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
      int number, results;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter Account Number: ");
      number = keyboard.nextInt();                
                      
      results = ChargeAccountValidation.sequentialSearch(valid, number);
      
      if (results == -1)
         System.out.println("Number invalid");
      else
         System.out.println("Number valid");
   }
}            