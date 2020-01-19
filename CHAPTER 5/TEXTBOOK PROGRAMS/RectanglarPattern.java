import java.util.Scanner;

public class RectanglarPattern
{
   public static void main(String[] args)
   {
      int rows, cols;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many rows? ");
      rows = keyboard.nextInt();
      System.out.print("How many columns? ");
      cols = keyboard.nextInt();
      
      for (int r = 0; r < rows; r++)
      {
         for (int c = 0; c < cols; c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}            