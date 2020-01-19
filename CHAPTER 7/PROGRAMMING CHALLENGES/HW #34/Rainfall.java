//1. Rainfall Class

public class Rainfall
{
   private double[] rain;
   
   public Rainfall(double[] r)
   {
      rain = r;
   }
   
   public double getTotalRainFall()   
   {
      double totalRainfall = 0;
      
      for (int i = 0; i < rain.length; i++)
         totalRainfall += rain[i];
      
      return totalRainfall;   
   }
   
   public double getAverageRainfall()
   {
      return getTotalRainFall() / rain.length;
   }      
   
   public double getHighestMonth()
   {
      double high = rain[0];
      
      for (int i = 0; i < rain.length; i++)
      {
         if (rain[i] > high)
            high = rain[i];
      }
      
      return high;
   }         
   
   public double getLowestMonth()
   {
      double low = rain[0];
      
      for (int i = 0; i < rain.length; i++)
      {
         if (rain[i] < low)
            low = rain[i];
      }
      
      return low;
   }   
   
   public double getRainAt(int e)
   {
      return rain[e];
   }
}
      
      
      