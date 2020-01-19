//7. Widget Factory

public class Widget
{
   private double numberOfWidgets;
   
   //Constructor
   public Widget(double n)
   {
      numberOfWidgets = n;
   }
   
   //Mutator methods
   public void setNumberOfWidgets(double n)
   {
      numberOfWidgets = n;
   }
   
   //Accessor methods
   public double getNumberOfWidgets()
   {
      return numberOfWidgets;
   }
   
   //Method for calculating how many days it takes to be produced
   public double getNumberOfDays()
   {
      //10 widgets per hour / 16 hours per day
      return (numberOfWidgets / 10) / 16;      
   }
}         