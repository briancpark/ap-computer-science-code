//3. Carpet Calculator

public class RoomDimension
{
   public static double length;
   public static double width;
   
   public RoomDimension(double len, double w)
   {
      length = len;
      width = w;
   }
   
   public double getArea()
   {
      return length * width;
   }
   
   public String toString()
   {
      String str = "Area of the room is " + getArea() + " sq ft.";
      
      return str;
   }
}               