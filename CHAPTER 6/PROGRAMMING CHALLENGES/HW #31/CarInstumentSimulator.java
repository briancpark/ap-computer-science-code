//12. Car_Instrument Simulator

public class CarInstumentSimulator
{
   public static void main(String[] args)
   {
      FuelGuage fg = new FuelGuage(1.3);
      Odometer od = new Odometer(1.243, fg);
      
      System.out.println(fg.getGallons() + " gallons");
      
      while (fg.getGallons() <= 15)
      {
         fg.incrementGallon();
         System.out.println(fg.getGallons() + " gallons");
      }   
      
      System.out.println("\nTank is full.");
      
      while (fg.getGallons() >= 0)
      {
         System.out.printf("\nOdometer: %.2f miles ||||| Fuel Tank: %.2f gallons",
                           od.getMileage(), fg.getGallons());
         od.incrementMileage();
      }                     
   }
}   