//6. Driver's License Exam

import java.util.Scanner;

public class DriversLicenseExamDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      char[] studentAnswers = new char[20];
      String stringAnswer;
      
      for (int i = 0; i < studentAnswers.length; i++)
      {
         System.out.print("Question " + (i + 1) + ": ");
         stringAnswer = keyboard.nextLine();
         
         switch (stringAnswer)
         {
            case "A":
            case "B":
            case "C":
            case "D":
               studentAnswers[i] = stringAnswer.charAt(0);   
               break;
            default: 
               System.out.println("Input validation. Answer must be A, B, C, or D");
               System.out.print("Question " + (i + 1) + ": ");
               stringAnswer = keyboard.nextLine();
               studentAnswers[i] = stringAnswer.charAt(0);
         }     
      }
      
      DriverExam std = new DriverExam(studentAnswers);
      
      System.out.println("Correct answers: " + std.totalCorrect());
      System.out.println("Incorrect answers: " + std.totalIncorrect());
      
      if (std.passed())
         System.out.println("You passed the exam.");
      else
         System.out.println("You failed the exam.");
   }
}      