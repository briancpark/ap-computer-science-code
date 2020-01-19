//4. Temperature Class

public class Temperature
{
   private double ftemp;
   
   //Constructor
   public Temperature(double f)
   {
      ftemp = f;
   }
   
   //Mutator methods
   public void setFarenheit(double f)
   {
      ftemp = f;
   }
   
   //Accessor methods
   public double getFarenheit()
   {
      return ftemp;
   }
   
   //Methods for conversions
   public double getCelsius()
   {
      return (5.0/9.0) * (ftemp - 32);
   }            
   
   public double getKelvin()
   {
      return ((5.0/9.0) * (ftemp - 32)) + 273;
   }
}      