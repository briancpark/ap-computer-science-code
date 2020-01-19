import java.util.Scanner;

public class SoccerTeams
{
   public static void main(String[] args)
   {
      final int MIN_PLAYERS = 9,
                MAX_PLAYERS = 15;
      int players,
          teamSize,
          teams,
          leftOver;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the number of players "
                       + "per team: ");
      teamSize = keyboard.nextInt();
      
      while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
      {
         System.out.println("You should have at least "
                            + MIN_PLAYERS
                            + " but no more than "
                            + MAX_PLAYERS + " per team.");
         System.out.print("Enter the number of players "
                          + "per team: ");            
         teamSize = keyboard.nextInt();
      }
      
      System.out.print("Enter the availiable nmber of players: ");
      players = keyboard.nextInt();
      
      while (players < 0)
      {
         System.out.println("Please do not enter a negative "
                            + "number.");
         System.out.print("enter the availiable number "
                          + "of players: ");
         players = keyboard.nextInt();
      }
      
      teams = players / teamSize;
      
      leftOver = players % teamSize;
      
      System.out.println("There will be " + teams + " teams "
                         + "with " + leftOver
                         + " players left over.");
   }
}                                                                                                                            