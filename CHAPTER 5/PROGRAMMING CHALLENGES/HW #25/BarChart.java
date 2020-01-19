//12. Bar Chart

import java.util.Scanner;

public class BarChart
{
   public static void main(String[] args)
   {
      double sales1, sales2, sales3, sales4, sales5;
      int bar1, bar2, bar3, bar4, bar5, bar;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Enter today's sales for store 1: ");
      sales1 = keyboard.nextDouble();
      System.out.print("Enter today's sales for store 2: ");
      sales2 = keyboard.nextDouble();
      System.out.print("Enter today's sales for store 3: ");
      sales3 = keyboard.nextDouble();
      System.out.print("Enter today's sales for store 4: ");
      sales4 = keyboard.nextDouble();
      System.out.print("Enter today's sales for store 5: ");
      sales5 = keyboard.nextDouble();
      
      bar1 = (int) sales1 / 100;
      bar2 = (int) sales2 / 100;
      bar3 = (int) sales3 / 100;
      bar4 = (int) sales4 / 100;
      bar5 = (int) sales5 / 100;
      
      System.out.println("SALES BAR CHART");
      
      System.out.print("Store 1: ");
         
      for (int stars = 1; stars <= bar1; stars++)
      {
         System.out.print("*");
      }   
      System.out.println();
      
      System.out.print("Store 2: ");
      
      for (int stars = 1; stars <= bar2; stars++)
      {
         System.out.print("*");
      }   
      System.out.println();
         
      System.out.print("Store 3: ");
         
      for (int stars = 1; stars <= bar3; stars++)
      {
         System.out.print("*");
      }   
      System.out.println();
      
      System.out.print("Store 4: ");
         
      for (int stars = 1; stars <= bar4; stars++)
      {
      System.out.print("*");
      }   
      System.out.println();         
      
      System.out.print("Store 5: ");
      
      for (int stars = 1; stars <= bar5; stars++)
      {
         System.out.print("*");
      }   
      System.out.println();
   }   
}      