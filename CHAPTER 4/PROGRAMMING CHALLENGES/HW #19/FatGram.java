//7. FatGram Class

public class FatGram
{
   private double calories;
   private double fatGrams;
   
   //Constructor
   public FatGram(double c, double f)
   {
      calories = c;
      fatGrams = f;
   }
   
   //Mutator methods
   public void setCalories(double c)
   {
      calories = c;
   }
   
   public void setFatGrams(double f)
   {
      fatGrams = f;
   }
   
   //Accessor methods
   public double getCalories()
   {
      return calories;
   }
   
   public double getFatGrams()
   {
      return fatGrams;
   }
   
   //Method for calculating fat percentage
   public double percentageFat()  
   {   
       return ((fatGrams * 9) / calories) * 100;
   }                
   
   //Methods for error messages
   public String warningMessage()
   {
      /*If percentagage of fat is lower than 30%, display warning.
      Otherwise, return a blank statement*/
      if (percentageFat() < 30.0)
         return "The food is low in fat.";
      else 
         return "";   
   }
   public String invalidNumbers()
   {      
      /*If there are more calories from fat than the total calories, 
      display error message. Otherwise, return blank statement*/
      if ((fatGrams * 9) > calories)
         return "Error. Percentage more than 100%. Invalid numbers.";
      else
         return "";  
   }        
}    