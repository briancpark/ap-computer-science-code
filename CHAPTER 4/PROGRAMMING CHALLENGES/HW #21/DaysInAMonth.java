//14. Days in a Month

public class DaysInAMonth
{
   private int month;
   private int year;
   
   //Constructor
   public DaysInAMonth(int m, int y)
   {
      month = m;
      year = y;
   }
   
   //Mutator methods 
   public void setMonth(int m)
   {
      month = m;
   }
   
   public void setYear(int y)
   {
      year = y;
   }        
   
   //Accessor methods
   public int getMonth()
   {
      return month;
   }
   
   public int getYear()
   {
      return year;
   }
   
   //Method for calculating number of days in a month
   public int getNumberOfDays()
   {
      int numberOfDays;
      
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            numberOfDays = 31;
            break;
         case 2:
            if (((year % 100) == 0 && (year % 400) == 0) || (year % 4) == 0)
               numberOfDays = 29;   
            else
               numberOfDays = 28;
            break;   
         default:
            numberOfDays = 30;            
      }   
      
      return numberOfDays;
   }
}         