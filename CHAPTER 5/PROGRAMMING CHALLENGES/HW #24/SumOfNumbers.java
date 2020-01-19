//1. Sum of Numbers

import java.util.Scanner;

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int number;
      int sum = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Please enter a positive nonzero integer: ");
      number = keyboard.nextInt();
      
      for (int count = 1; count <= number; count++)
      {
         sum += count;
      }
      
      //Display sum
      System.out.printf("Sum of numbers between 1 through %d is %d", number, sum);
   }
}        