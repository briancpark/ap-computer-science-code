//12. String Manipulator

import java.util.Scanner;

public class StringManipulator
{
   public static void main(String[] args)
   {
      String city;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is your favorite city?: ");
      city = keyboard.nextLine();
      
      String upper = city.toUpperCase();
      String lower = city.toLowerCase();
      char letter = city.charAt(0);
      
      System.out.println(upper);
      System.out.println(lower);
      System.out.println(letter);      
   }
}   