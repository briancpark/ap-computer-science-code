//5. Month Class

public class Month
{
   private int monthNumber;
   
   public Month()
   {
      monthNumber = 1;
   }
   
   public Month(int mn)
   {
      if (mn >= 1 && mn <= 12)
         monthNumber = mn;
      else
         monthNumber = 1;  
   }
   
   public Month(String mn)
   {
      if (mn.equalsIgnoreCase("JANUARY"))
         monthNumber = 1;
      else if (mn.equalsIgnoreCase("FEBRUARY"))
         monthNumber = 2;  
      else if (mn.equalsIgnoreCase("MARCH"))
         monthNumber = 3; 
      else if (mn.equalsIgnoreCase("APRIL"))
         monthNumber = 4; 
      else if (mn.equalsIgnoreCase("MAY"))
         monthNumber = 5; 
      else if (mn.equalsIgnoreCase("JUNE"))
         monthNumber = 6; 
      else if (mn.equalsIgnoreCase("JULY"))
         monthNumber = 7; 
      else if (mn.equalsIgnoreCase("AUGUST"))
         monthNumber = 8; 
      else if (mn.equalsIgnoreCase("SEPTEMBER"))
         monthNumber = 9; 
      else if (mn.equalsIgnoreCase("OCTOBER"))
         monthNumber = 10; 
      else if (mn.equalsIgnoreCase("NOVEMBER"))
         monthNumber = 11;                             
      else if (mn.equalsIgnoreCase("DECEMBER"))
         monthNumber = 12;
      else
         monthNumber = 1;
   }        
         
   public void setMonthNumber(int mn)
   {
      if (mn < 1 || mn > 12)
         monthNumber = 1; 
      else 
         monthNumber = mn;
   }
   
   public int getMonthNumber()   
   {
      return monthNumber;
   }
   
   public String getMonthName() 
   {
      String monthName;
      
      switch (monthNumber)
      {
         case 1:
            monthName = "January";
            break;     
         case 2:
            monthName = "February";
            break;    
         case 3:
            monthName = "March";
            break;    
         case 4:
            monthName = "April";
            break;    
         case 5:
            monthName = "May";
            break;    
         case 6:
            monthName = "June";
            break;    
         case 7:
            monthName = "July";
            break;    
         case 8:
            monthName = "August";
            break;    
         case 9:
            monthName = "September";
            break;    
         case 10:
            monthName = "October";
            break;    
         case 11:
            monthName = "November";
            break;                                          
         case 12:
            monthName = "December";
            break;
         default:
            monthName = "Invalid month";   
      }  
      
      return monthName;
   }       
      
   public String toString()  
   {
      return getMonthName();
   }
   
   public boolean equals(Month month2)
   {
      boolean status;
      
      if (monthNumber == month2.getMonthNumber())
         status = true;
      else
         status = false;
      
      return status;
   }                  
   
   public boolean greaterThan(Month month2)
   {
      boolean status;
      
      if (monthNumber > month2.getMonthNumber())
         status = true;
      else 
         status = false;
         
      return status;
   }       
   
   public boolean lessThan(Month month2)
   {
      boolean status;
      
      if (monthNumber < month2.getMonthNumber())
         status = true;
      else 
         status = false;
         
      return status;
   }              
}            
