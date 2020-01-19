public class SpeedTable
{
   public static void main(String[] args)
   {
      final int STARTING_KPH = 60;
      final int MAX_KPH = 130;
      final int INCREMENT = 10;
      
      int kph;
      double mph;
      
      SpeedConverter converter = new SpeedConverter();
      
      System.out.println("KPH\t\tMPH");
      System.out.println("----------------");
      
      for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
      {
         mph = converter.getMPH(kph);
         
         System.out.printf("%d\t\t%.1f\n", kph, mph);
      }
   }
}         