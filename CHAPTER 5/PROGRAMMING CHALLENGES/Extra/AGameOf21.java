//24. A Game of 21

import java.util.Scanner;

public class AGameOf21
{
   public static void main(String[] args)
   {
      char gameStart;
      String response;
      int points = 0, computerPoints = 0, pointKeeper;
      
      Scanner keyboard = new Scanner(System.in);
      Die user = new Die(6);
      
      System.out.print("Do you want to play a game? (Y/N): ");
      response = keyboard.nextLine();
      
      gameStart = response.charAt(0);
      
      while (gameStart == 'Y' || gameStart == 'y')
      {
         System.out.print("Would you like to roll a die for points? (Y/N): ");
         response = keyboard.nextLine();
         
         while (gameStart == 'Y' || gameStart == 'y')
         {
            user.roll();
            computerPoints += user.getValue();
            System.out.print("Computer has rolled. Would you like to roll a die? (Y/N): ");
            response = keyboard.nextLine();
         
            gameStart = response.charAt(0);
            
            if (gameStart == 'Y' || gameStart == 'y')
            {
               user.roll();
               pointKeeper = user.getValue();
               points += pointKeeper;
               System.out.printf("You rolled a %d. Your total is %d. \n", pointKeeper, points);
            }
               
            System.out.print("Would you like to roll another die? (Y/N): ");
            response = keyboard.nextLine();
            
            gameStart = response.charAt(0);
         }   
         
         if (points < 21)
            if (computerPoints < 21)
               if (points < computerPoints)
                  System.out.println("Computer win");
               else 
                  System.out.println("You win");        
         else
            System.out.println("You lose");
            
            
      }
   }
}         
            
      