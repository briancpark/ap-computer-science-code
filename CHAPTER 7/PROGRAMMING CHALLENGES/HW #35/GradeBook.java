//8. Grade Book

public class GradeBook
{
   private final int NUM_STUDENTS = 5;
   private final int NUM_TESTS = 4;
   private String[] names = new String[NUM_STUDENTS];
   private char[] grades = new char[NUM_STUDENTS];
   private double[] scores1 = new double[NUM_TESTS];
   private double[] scores2 = new double[NUM_TESTS];
   private double[] scores3 = new double[NUM_TESTS];
   private double[] scores4 = new double[NUM_TESTS];
   private double[] scores5 = new double[NUM_TESTS];
   private int studentNum;
   
   public void setName(int studentNum, String name)
   {
      names[studentNum] = name;
   }
   
   public String getNames(int studentNum)
   {
      return names[studentNum];
   }
   
   public double getAverage(int studentNum)
   {
      double total = 0;
      double average;
      
      switch (studentNum)
      {
         case 1:
            for(int i = 0; i < scores1.length; i++)
            {
               total += scores1[i];
            }
            average = total / 4.0;
            break;
         case 2: 
            for(int i = 0; i < scores2.length; i++)
            {
               total += scores2[i];
            }
            average = total / 4.0;
            break;
         case 3:
            for(int i = 0; i < scores3.length; i++)
            {
               total += scores3[i];
            }
            average = total / 4.0;
            break;
         default:
            for(int i = 0; i < scores4.length; i++)
            {
               total += scores4[i];
            }
            average = total / 4.0;
      }
      
      return average;
   }                 
      
   public char getLetterGrade(int studentNum)
   {
      if(studentNum == 1)
         return grades[0];
      else if(studentNum == 2)
         return grades[1];
      else if(studentNum == 3)
         return grades[2];
      else if(studentNum == 4)
         return grades[3];
      else 
         return grades[4];
   } 
   
   public char determineGrade(double average)
   {
      if(average >= 0 && average < 60)
         return 'F';
      else if(average >= 60 && average < 70)
         return 'D';
      else if(average >=70 && average < 80)
         return 'C';
      else if(average >= 80 && average < 90)
         return 'B';
      else 
         return 'A';
   }
}          
   
   
   