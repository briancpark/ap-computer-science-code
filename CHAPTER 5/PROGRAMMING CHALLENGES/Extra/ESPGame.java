//25. ESP Game

import java.util.Scanner;
import java.util.Random;

public class ESPGame
{
   public static void main(String[] args)
   {
      int randomColorMaker, correctCounter = 0;
      String color, colorAnswer;
      
      Scanner keyboard = new Scanner(System.in);
      Random randomColor = new Random();
      
      System.out.println("Objective of the game is to guess the correct color.\n" +
                         "Choose Red, Green, Blue, Orange, or Yellow");        
      
      for (int count = 1; count <= 10; count++)
      {
         randomColorMaker = randomColor.nextInt(5);
         
         System.out.print("Guess a color: ");
         color = keyboard.nextLine();
         
         switch (randomColorMaker)
         {
            case 0:
               colorAnswer = "red";
               break;
            case 1:
               colorAnswer = "green";
               break;
            case 2:
               colorAnswer = "blue";
               break;
            case 3:
               colorAnswer = "orange";
               break;
            default:
               colorAnswer = "yellow";
               break;
         }         
         
         if (color.equalsIgnoreCase(colorAnswer))
         {
            System.out.println("Correct!");
            correctCounter += 1;
         }
         else
         {
            System.out.printf("Wrong. Answer was %s.\n", colorAnswer);
         }      
      }      
         
      System.out.printf("You have guessed the color correctly %d time(s).", correctCounter);
      
   }
}                                   
         