//3. TestScores Class

public class TestScores
{
   private double test1;
   private double test2;
   private double test3;
   
   //Constructor
   public TestScores(double t1, double t2, double t3)
   {
      test1 = t1;
      test2 = t2;
      test3 = t3;
   }
   
   //Mutator methods
   public void setTest1(double t1)
   {
      test1 = t1;
   }   
   
   public void setTest2(double t2)
   {
      test2 = t2;
   }      
   
   public void setTest3(double t3)
   {
      test3 = t3;
   }         
   
   //Accessor methods
   public double getTest1()
   {
      return test1;
   }   
   
   public double getTest2()
   {
      return test2;
   }   
   
   public double getTest3()
   {
      return test3;
   }   
   
   //Methods for calculating
   public double average()
   {
      return (test1 + test2 + test3) / 3;
   }
   
   public char letterGrade()
   {
      char grade = 'a';
      double average = (test1 + test2 + test3) / 3;
      
      if (average >= 90)
         grade = 'A';
      else if (average >= 80 && average <= 89)  
         grade = 'B';   
      else if (average >= 70 && average <= 79)  
         grade = 'C';   
      else if (average >= 60 && average <= 69)  
         grade = 'D';   
      else if (average < 60)  
         grade = 'F'; 
      
      return grade;      
   }
}              
   
               