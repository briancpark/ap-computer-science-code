//1. Area Class

public class Area
{
   public static double getArea(double radius)
   {
      return Math.PI * Math.pow(radius, 2);
   }
   
   public static double getArea(double width, double length)
   {
      return width * length;
   }
   
   public static double getArea(double radius, int height)
   {
      return Math.PI * Math.pow(radius, 2) * height;
   }
}         
      