import java.util.Scanner;

public class ArrayDemo2
{
   public static void main(String[] args)
   {
      final int NUM_EMPLOYEES = 3;
      
      int[] hours = new int [NUM_EMPLOYEES];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the hours worked by "
                     + NUM_EMPLOYEES + " employees.");
                     
      for (int index = 0; index < NUM_EMPLOYEES; index++)
      {
         System.out.print("Employee " + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }
      
      System.out.println("The hours you entered are:");
      for (int index = 0; index < NUM_EMPLOYEES; index++)
         System.out.println(hours[index]);
   }
}                              