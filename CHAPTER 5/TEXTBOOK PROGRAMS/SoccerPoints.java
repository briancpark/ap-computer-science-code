import java.util.Scanner;

public class SoccerPoints
{
   public static void main(String[] args)
   {
      int points,
          totalPoints = 0;
         
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the number of points your team");
      System.out.println("has earned for each game this season.");    
      System.out.println("Enter -1 when finished.");
      System.out.println();
      
      System.out.print("Enter game points or -1 to end: ");
      points = keyboard.nextInt();
      
      while (points != -1)
      {
         totalPoints += points;
         
         System.out.print("Enter game points or -1 to end: ");
         points = keyboard.nextInt();
      }
      
      System.out.println("The total points are " +
                         totalPoints);
   }
}                            