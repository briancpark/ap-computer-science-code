//10. Test Average

import java.util.Scanner;

public class TestAverage
{
   public static void main(String[] args)
   {
      double test1, test2, test3;
      double average;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your 1st test score: ");
      test1 = keyboard.nextDouble();
      System.out.print("Enter your 2nd test score: ");
      test2 = keyboard.nextDouble();
      System.out.print("Enter your 3rd test score: ");
      test3 = keyboard.nextDouble();
      
      average = (test1 + test2 + test3) / 3;
      
      System.out.printf("\n\nTest score 1: %.2f\nTest score 2: %.2f\nTest score 3: %.2f\n\n" + 
                        "Your average is %.2f", test1, test2, test3, average);
      System.out.print("%");                 
   }
}     
