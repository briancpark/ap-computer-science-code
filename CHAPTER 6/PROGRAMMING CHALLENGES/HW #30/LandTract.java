//4. LandTract Class

public class LandTract
{
   private double length;
   private double width;
   
   //Constructor
   public LandTract(double len, double w)
   {
      length = len;
      width = w;
   }
   
   //Method for calcualting area
   public double getArea()
   {
      return length * width;
   }
   
   //Method for comparing LandTract objects
   public boolean equals(LandTract tract2)
   {
      boolean status;
      
      if (tract2.getArea() == this.getArea() && tract2.length == this.length)
         status = true;
      else
         status = false;
      
      return status;
   }         
   
   //String method for displaying info
   public String toString()
   {
      String str = "Area: " + getArea() + " sqft";
      
      return str;
   }
}              