//9. Circle Class

import java.util.Scanner;

public class CircleDemo
{
   public static void main(String[] args)
   {
      double rad;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for radius
      System.out.print("What is the radius of the circle?: ");
      rad = keyboard.nextDouble();
      
      //Create new circle object
      Circle c1 = new Circle(rad);
      
      //Display circle information
      System.out.printf("The radius of the circle is %.2f.\n" +
                        "The diameter of the circle is %.2f\n" +
                        "The circumference of the circle is %.2f\n" +
                        "The area of the circle is %.2f",
                        c1.getRadius(), c1.getDiameter(),
                        c1.getCircumference(), c1.getArea());
   }
}                        