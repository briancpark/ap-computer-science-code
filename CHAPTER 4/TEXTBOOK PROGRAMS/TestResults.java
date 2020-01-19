import java.util.Scanner;

public class TestResults
{
   public static void main(String[] args)
   {
      int testScore;
      char letterGrade;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your numeric test score and "
                     + "I will tell you the grade: ");
      testScore = keyboard.nextInt();
      
      TestGrade test = new TestGrade(testScore);
      
      letterGrade = test.getLetterGrade();
      
      System.out.print("Your grade is "
                     + test.getLetterGrade());
   }
}                     