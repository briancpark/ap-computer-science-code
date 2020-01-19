//9. The Speed of Sound

public class TheSpeedOfSound
{
   private final double AIR_SPEED = 1100.0;
   private final double WATER_SPEED = 4900.0;
   private final double STEEL_SPEED = 16400.0;
   private double distance;
   
   //Constructor
   public TheSpeedOfSound(double d)
   {
      distance = d;
   }
   
   //Mutator methods
   public void setDistance(double d)
   {
      distance = d;
   }
   
   //Accessor methods
   public double getDistance()
   {
      return distance;
   }
   
   /*Methods for calculating number of seconds 
   it takes for a wave to travel for a material */
   public double getSpeedInAir()
   {
      return distance / AIR_SPEED;
   }
   
   public double getSpeedInWater()
   {
      return distance / WATER_SPEED;
   }
   
   public double getSpeedInSteel()
   {
      return distance / STEEL_SPEED;
   }
}                       