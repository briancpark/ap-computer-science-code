//6. Driver's License Exam

public class DriverExam
{
   private char[] correct = { 'B', 'D', 'A', 'A', 'C',
                              'A', 'B', 'A', 'C', 'D',
                              'B', 'C', 'D', 'A', 'D',
                              'C', 'C', 'B', 'D', 'A' };
   private char[] student = new char[20];
   private int[] missed;
   private int numCorrect = 0;
   private int numIncorrect = 0;
   
   public DriverExam(char[] s)
   {
      student = new char[s.length];
      for (int i = 0; i < s.length; i++)
         student[i] = s[i];
      gradeExam();
   }
   
   private void gradeExam()
   {
      for (int i = 0; i < student.length; i++)
      {
         if (student[i] == correct[i])
            numCorrect++;
         else
            numIncorrect++;
      }
   }
      
   public boolean passed()
   {
      if (numCorrect >= 15)
         return true;
      else
         return false;
   }
   
   public int totalCorrect()
   {
      return numCorrect;
   }
   
   public int totalIncorrect()
   {
      return numIncorrect;
   }
   
   public int[] questionsMissed()
   { 
      int[] missed = new int[numIncorrect];
      int x = 0;
      
      for (int i = 0; i < student.length; i++)
      {
         if (student[i] != correct[i])
         {
            missed[x] = (i + 1);   
            x++;
         }
      } 
      
      return missed;     
   }                   
}      