//9. Circle Class

public class Circle
{
   private double radius;
   private final double PI = 3.14159;
   
   //Constructor
   public Circle(double r)
   {
      radius = r;
   }   
   
   //Mutator methods
   public void setRadius(double r)
   {
      radius = r;
   }
   
   //Accessor methods
   public double getRadius()
   {
      return radius;
   }
   
   //Methods that calculate diameter/circumference
   public double getDiameter()
   {
      return radius * 2;
   }
   
   public double getCircumference()
   {
      return 2 * PI * radius;
   }
   
   public double getArea()
   {
      return PI * radius * radius;
   }   
}              