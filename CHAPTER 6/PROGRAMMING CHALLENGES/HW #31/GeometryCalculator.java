//11. Geometry Calculator

import java.util.Scanner;

public class GeometryCalculator
{
   public static void main(String[] args)
   {
      double radius, length, width, base, height;
      int input;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Gemometry Calculator");
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calcualte the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit");
      System.out.println();
      
      System.out.print("Enter your choice (1-4): ");
      input = keyboard.nextInt();

      while (input < 1 || input > 4)
      {
         System.out.println("Invalid input.");
         System.out.print("Enter your choice (1-4): ");
         input = keyboard.nextInt(); 
      }
      
      switch (input)
      {
         case 1:
            System.out.print("Enter radius of the circle: ");  
            radius = keyboard.nextDouble();
            
            while (radius < 0)
            {
               System.out.println("Error. Negative number.");
               System.out.print("Enter radius of the circle: ");
               radius = keyboard.nextDouble(); 
            }   
            
            System.out.println("Area = " + Geometry.areaCircle(radius));
            break;
         case 2:
            System.out.print("Enter length of the rectangle: ");  
            length = keyboard.nextDouble();
            
            while (length < 0)
            {
               System.out.println("Error. Negative number.");
               System.out.print("Enter length of the rectangle: ");
               length = keyboard.nextDouble(); 
            }   

            System.out.print("Enter width of the rectangle: ");  
            width = keyboard.nextDouble();
            
            while (width < 0)
            {
               System.out.println("Error. Negative number.");
               System.out.print("Enter width of the rectangle: ");
               width = keyboard.nextDouble(); 
            }   
            
            System.out.println("Area = " + Geometry.areaRectangle(length, width));
            break;   
         case 3:
            System.out.print("Enter base of the triangle: ");  
            base = keyboard.nextDouble();
            
            while (base < 0)
            {
               System.out.println("Error. Negative number.");
               System.out.print("Enter base of the triangle: ");
               base = keyboard.nextDouble(); 
            }   
            
            System.out.print("Enter height of the triangle: ");  
            height = keyboard.nextDouble();
            
            while (height < 0)
            {
               System.out.println("Error. Negative number.");
               System.out.print("Enter height of the triangle: ");
               height = keyboard.nextDouble(); 
            }   
            
            System.out.println("Area = " + Geometry.areaTriangle(base, height));
            break;   
         case 4:
            System.out.println("Quit");
            break;
         default:   
            System.out.println("Invalid shape");
      }
   }
} 