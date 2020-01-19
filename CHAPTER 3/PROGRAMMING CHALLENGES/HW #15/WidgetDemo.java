//7. Widget Factory

import java.util.Scanner;

public class WidgetDemo
{
   public static void main(String[] args)
   {
      double wid;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("How many widget(s) do you want to produce?: ");
      wid = keyboard.nextDouble();
      
      //Create new widget object
      Widget w1 = new Widget(wid);
      
      //Display information
      System.out.printf("The number of day it takes to produce %.2f widget(s) " +
                        "is %.2f days", 
                        w1.getNumberOfWidgets(), w1.getNumberOfDays());
   }
}                        
      
      