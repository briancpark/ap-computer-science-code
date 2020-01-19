import java.util.Scanner;

public class TestAverages2
{
   public static void main(String[] args)
   {
      int numStudents;
      int numTests;
      double score;
      double total;
      double average;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This program averages test scores.");
      
      System.out.print("How many students do you have? ");
      numStudents = keyboard.nextInt();
      
      System.out.print("How many test scores per student? ");
      numTests = keyboard.nextInt();
      
      for (int student = 1; student <= numStudents; student++)
      {
         total = 0.0;
         
         for (int test = 1; test <= numTests; test++)
         {
            System.out.print("Enter score " + test
                           + " for student " + student + ": ");
            score = keyboard.nextDouble();
            total += score;
         }
      
         average = total / numTests;
         System.out.println("The average score for student "
                           + student + " is " + average);
         System.out.println();
      }
   }
}                                        