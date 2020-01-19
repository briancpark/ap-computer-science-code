//1. FRQ

import java.util.Scanner;

public class QuadraticEquationDemo
{
   public static void main(String[] args)
   {
      double a, b, c;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.println("Enter the coefficients for a, b, and c of the quadratic equation.");
      System.out.print("A: ");
      a = keyboard.nextDouble();
      System.out.print("B: ");
      b = keyboard.nextDouble();
      System.out.print("C: ");
      c = keyboard.nextDouble();
      
      QuadraticEquation user = new QuadraticEquation(a, b, c);
      
      if (user.hasSolutions())
      {
         System.out.printf("Solution 1: %.2f\nSolution 2: %.2f\n",
                           user.getSolution1(), user.getSolution2());
      }
      else
      {
         System.out.println("There is no solution.");
      }
   }
}
                               