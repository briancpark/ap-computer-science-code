//12. Car-Instrument Simulator

public class Odometer
{
   private final int MAXIMUM_MILEAGE = 999999;
   private final int MILES_PER_GALLON = 24;
   private double mileage;
   private FuelGuage fuelGuage;
   
   public Odometer(double m, FuelGuage fg)
   {
      mileage = m;
      fuelGuage = fg;
   }
   
   public void setMileage(double m)
   {
      mileage = m;
   }
   
   public double getMileage()
   {
      return mileage;
   } 
   
   public void incrementMileage()
   {
      if (mileage >= 0 && mileage <= MAXIMUM_MILEAGE)
      {
         ++mileage;
         
         double gallonDifference = mileage / MILES_PER_GALLON;

         fuelGuage.setGallons(fuelGuage.getGallons() - gallonDifference);
      }   
      else
         mileage = 0;     
   }
}                          