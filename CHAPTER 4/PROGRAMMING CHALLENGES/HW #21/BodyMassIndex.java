//13. Body Mass Index

import java.util.Scanner;

public class BodyMassIndex
{
   public static void main(String[] args)
   {
      double weight, height, BMI;
      final double BMI_MIN = 18.5;
      final double BMI_MAX = 25.0;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("What is your height in inches?: ");
      height = keyboard.nextDouble();
      System.out.print("What is your weight in pounds?: ");
      weight = keyboard.nextDouble();
      
      //Equation for calculating BMI
      BMI = weight * (703 / (height * height));
      
      /*If-else-if statement determining whether person 
      is overweight, underweight, or optimal weight*/
      if(BMI > BMI_MAX)
         System.out.printf("Your BMI is %.2f. You are overweight.", BMI);
      else if (BMI < BMI_MIN)
         System.out.printf("Your BMI is %.2f. You are underweight.", BMI);
      else
         System.out.printf("Your BMI is %.2f. You have optimal weight.", BMI);
   }
}               
         
      