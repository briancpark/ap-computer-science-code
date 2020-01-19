import java.util.Scanner;

public class PassArray
{
   public static void main(String[] args)
   {
      final int ARRAY_SIZE = 4;
      
      int[] numbers = new int[ARRAY_SIZE];
      
      getValues(numbers);
      
      System.out.println("Here are the numbers "
                         + "that you enteres:");
      
      showArray(numbers);
   }
   
   private static void getValues(int[] array)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a series of "
                  + array.length + " numbers.");
      
      for (int index = 0; index < array.length; index++)
      {
         System.out.print("Number " + (index + 1) + ": ");
         array[index] = keyboard.nextInt();
      }
   }
   
   public static void showArray(int[] array)
   {
      for (int value : array)
         System.out.print(value + " ");  
   }                                     
}
           