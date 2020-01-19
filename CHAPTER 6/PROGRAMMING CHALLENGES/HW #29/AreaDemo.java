//1. Area Class

import java.util.Scanner;

public class AreaDemo
{
   public static void main(String[] args)
   {
      double radius, length, width;
      int height;
      String shape;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      
      System.out.print("What is the shape? Circle, Rectangle, or Cylinder?: ");
      shape = keyboard.nextLine();
      
      if (shape.equalsIgnoreCase("circle"))
      {
         System.out.print("What is the radius of the circle: ");
         radius = keyboard.nextDouble();
         System.out.println("The area of the circle is " + Area.getArea(radius));         
      }
      else if (shape.equalsIgnoreCase("rectangle"))
      {
         System.out.print("What is the length of the rectangle: ");
         length = keyboard.nextDouble();
         System.out.print("What is the width of the rectangle: ");
         width = keyboard.nextDouble();
         System.out.println("The area of the rectangle is " + Area.getArea(width, length));           
      }
      else if (shape.equalsIgnoreCase("cylinder"))
      {
         System.out.print("What is the radius of the cylinder: ");
         radius = keyboard.nextDouble();
         System.out.print("What is the height of the cylinder: ");
         height = keyboard.nextInt();
         System.out.println("The area of the cylinder is " + Area.getArea(radius, height));
      }
      else        
         System.out.println("Invalid shape."); 
   }
}               