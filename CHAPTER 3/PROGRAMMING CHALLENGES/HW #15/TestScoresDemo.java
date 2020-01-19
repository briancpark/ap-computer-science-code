//8. TestScores Class

import java.util.Scanner;

public class TestScoresDemo
{
   public static void main(String[] args)
   {
      double t_1, t_2, t_3;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user to input three test scores
      System.out.println("Enter three test scores: ");
      t_1 = keyboard.nextDouble();  
      t_2 = keyboard.nextDouble();
      t_3 = keyboard.nextDouble();  
      
      TestScores tests = new TestScores(t_1, t_2, t_3);
      
      System.out.printf("\nYour average is %.2f.", tests.average());
   }
}      