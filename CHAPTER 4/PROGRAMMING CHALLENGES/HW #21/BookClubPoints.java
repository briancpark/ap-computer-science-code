//15. Book Club Points

import java.util.Scanner;

public class BookClubPoints
{
   public static void main(String[] args)
   {
      int books, points;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for info
      System.out.print("How many books did you purchase?: ");
      books = keyboard.nextInt();
      
      switch (books)
      {
         case 0:
            points = 0;
            break;
         case 1:
            points = 5;
            break;
         case 2:
            points = 15;
            break;
         case 3:
            points = 30;
            break;
         default:
            points = 60;
      }  
      
      if (books < 0)
         System.out.println("Error. Invalid number of books.");
      else
         System.out.printf("You have earned %d points!", points);
   }
}            
                    