//8. Running the Race

public class RunningTheRace
{
   private String name1;
   private String name2;
   private String name3;
   private double time1;
   private double time2;
   private double time3;
   
   //Constructor
   public RunningTheRace(String n1, String n2, String n3, 
                         double t1, double t2, double t3)
   {
      name1 = n1;
      name2 = n2;
      name3 = n3;
      time1 = t1;
      time2 = t2;
      time3 = t3;
   }
   
   //Mutator methods
   public void setName1(String n1)
   {
      name1 = n1;
   }    
   
   public void setName2(String n2)
   {
      name2 = n2;
   }  
   
   public void setName3(String n3)
   {
      name3 = n3;
   }  
   
   public void setTime1(double t1)
   {
      time1 = t1;
   }  
   
   public void setTime2(double t2)
   {
      time2 = t2;
   }              
   
   public void setTime3(double t3)
   {
      time3= t3;
   }          
   
   //Accessor methods
   public String getName1()
   {
      return name1;
   }      
   
   public String getName2()
   {
      return name2;
   }   
   
   public String getName3()
   {
      return name3;
   }   
   
   public double getTime1()
   {
      return time1;
   }                
   
   public double getTime2()
   {
      return time2;
   }             
   
   public double getTime3()
   {
      return time3;
   }
   
   //Method for calculating place
   public String Place() 
   {
      if (time1 < time2 && time2 < time3)
         return ("1st Place: " + name1 + "\n2nd Place: " + name2 + "\n3rd Place: " + name3);
      else if (time1 < time3 && time3 < time2)
         return ("1st Place: " + name1 + "\n2nd Place: " + name3 + "\n3rd Place: " + name2);  
      else if (time2 < time1 && time1 < time3)
         return ("1st Place: " + name2 + "\n2nd Place: " + name1 + "\n3rd Place: " + name3);  
      else if (time2 < time3 && time3 < time1)
         return ("1st Place: " + name2 + "\n2nd Place: " + name3 + "\n3rd Place: " + name1);
      else if (time3 < time2 && time2 < time1)
         return ("1st Place: " + name3 + "\n2nd Place: " + name2 + "\n3rd Place: " + name1);
      else 
         return ("1st Place: " + name3 + "\n2nd Place: " + name1 + "\n3rd Place: " + name2);
   }                      
}                      