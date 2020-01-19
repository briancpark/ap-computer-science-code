//11. Geometry Calculator

public class Geometry
{
   public static double areaCircle(double r)
   {
      return Math.PI * Math.pow(r, 2);
   }
   
   public static double areaRectangle(double l, double w)
   {
      return l * w;
   }
   
   public static double areaTriangle(double b, double h)
   {
      return b * h * .5;
   }
}            