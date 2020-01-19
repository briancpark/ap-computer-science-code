//8. Grade Book

import java.util.Scanner;

public class GradebookTester
{
   public static void main(String[] args)
   {
      final int NUM_STUDENTS = 5;
      final int NUM_TESTS = 4;
      
      String[] name = new String[NUM_STUDENTS];
      char[] grades = new char[NUM_TESTS];
      double[] scores1 = new double[NUM_TESTS];
      double[] scores2 = new double[NUM_TESTS];
      double[] scores3 = new double[NUM_TESTS];
      double[] scores4 = new double[NUM_TESTS];
      double[] scores5 = new double[NUM_TESTS];
      
      int studentNum = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      GradeBook std = new GradeBook();
      
      for (int i = 0; i < NUM_STUDENTS; i++)
      {
         System.out.print("Enter the student's name: ");
         name[i] = keyboard.nextLine();
         System.out.println();
         std.setName(i, name[i]);
      }   
      
 
      System.out.println("Student 1:");
      for(int i = 0; i < NUM_TESTS; i++)
      {
         System.out.println("Enter grade " + (i + 1));
         scores1[i] = keyboard.nextDouble();
         while(scores1[i] < 0 || scores1[i] > 100)
         {
            System.out.println("Please enter a number between 0 and 100: ");
            scores1[i] = keyboard.nextDouble();
         }
      }
   
      System.out.println("Student 2: ");
      for(int i = 0; i < NUM_TESTS; i++)
      {
         System.out.println("Enter grade " + (i + 1));
         scores2[i] = keyboard.nextDouble();
         while(scores2[i] < 0 || scores2[i] > 100)
         {
            System.out.println("Please enter a number between 0 and 100: ");
            scores2[i] = keyboard.nextDouble();
         }
      }
      
      System.out.println("Student 3: ");
      for(int i = 0; i < NUM_TESTS; i++)
      {
         System.out.println("Enter grade " + (i + 1));
            scores3[i] = keyboard.nextDouble();
            while(scores3[i] < 0 || scores3[i] > 100)
            {
               System.out.println("Please enter a number between 0 and 100: ");
               scores3[i] = keyboard.nextDouble();
            }
      }
      
      System.out.println("Student 4: ");
      for(int i = 0; i < NUM_TESTS; i++)
      {
         System.out.println("Enter grade " + (i + 1));
         scores4[i] = keyboard.nextDouble();
         while(scores4[i] < 0 || scores4[i] > 100)
         {
            System.out.println("Please enter a number between 0 and 100: ");
            scores4[i] = keyboard.nextDouble();
         }
      }
      
      System.out.println("Student 5: ");
      for(int i = 0; i < NUM_TESTS; i++)
      {
         System.out.println("Enter grade " + (i + 1));
         scores5[i] = keyboard.nextDouble();
         while(scores5[i] < 0 || scores5[i] > 100)
         {
            System.out.println("Please enter a number between 0 and 100: ");
            scores5[i] = keyboard.nextDouble();
         }
      }
      
      

      for(int i = 1; i < name.length; i++)
      {
        System.out.println("Name: " + std.getNames(i));
        System.out.println("Average Grade: " + std.getAverage(i));
        System.out.println("Letter Grade: " + std.determineGrade(std.getAverage(i)));
        System.out.println();
      }
   }
}   
