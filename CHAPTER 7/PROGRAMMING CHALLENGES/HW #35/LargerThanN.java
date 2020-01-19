//4. Larger Than n

import java.util.Scanner;

public class LargerThanN
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int n, arraySize;
      
      System.out.print("How long is the array?: ");
      arraySize = keyboard.nextInt();
      
      int[] array = new int[arraySize];
            
      for (int i = 0; i < array.length; i++)
      {
         System.out.print("Enter number: ");
         array[i] = keyboard.nextInt();
      }   
      
      System.out.println("Enter a number. This number will output everything in the");
      System.out.print("array that is greater than this number: ");
      n = keyboard.nextInt(); 
      
      for (int val : array)
      {
         if (val > n)
            System.out.println(val);      
      }   
   }     
}    