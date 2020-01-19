//12. Car-Instrument Simulator

public class FuelGuage
{
   private final double MAXIMUM_GALLONS = 15;
   private double gallons;
   
   public FuelGuage()
   {
      gallons = 0;
   }
   
   public FuelGuage(double g)
   {
      gallons = g;
   }
   
   public void setGallons(double g)
   {
      gallons = g;
   }
   
   public double getGallons()
   {
      return gallons;
   }
   
   public void incrementGallon()
   {
      if (gallons <= MAXIMUM_GALLONS && gallons >= 0)
         gallons++;
   }
   
   public void decrementGallon()
   {
      if (gallons <= MAXIMUM_GALLONS && gallons >= 0)
         gallons--;
   }
}                    