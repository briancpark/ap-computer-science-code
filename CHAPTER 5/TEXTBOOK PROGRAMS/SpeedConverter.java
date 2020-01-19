public class SpeedConverter
{
   final double CONVERSION_FACTOR = 0.6214;
   
   public double getMPH(double kph)
   {
      return kph * CONVERSION_FACTOR;
   }
}      