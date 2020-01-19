//17. Random Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessingGame
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random num = new Random();
      
      //Create and store random number
      int randomNum = num.nextInt(101);

      int userNum;
      
      System.out.print("Guess a number in the range of 0 and 100: ");
      userNum = keyboard.nextInt();
      
      //Loop for determining correct guess of number
      while (!(userNum == randomNum))
      {
         while (userNum > randomNum)
         {
            System.out.println("Too high, try again.");
            System.out.print("Guess what the random number is: ");
            userNum = keyboard.nextInt();
         }
         while (userNum < randomNum)
         {
            System.out.println("Too low, try again.");
            System.out.print("Guess what the random number is: ");
            userNum = keyboard.nextInt();   
         }
      }
      
      System.out.println(randomNum + " is the correct number!");
   }
}         
         
      