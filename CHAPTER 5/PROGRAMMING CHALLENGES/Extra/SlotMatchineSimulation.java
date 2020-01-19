//26. Slot Machine

import java.util.Scanner;
import java.util.Random;

public class SlotMatchineSimulation
{
   public static void main(String[] args)
   {
      double moneyEntered;
      int counter0 = 0, counter1 = 0, counter2 = 0, 
          counter3 = 0, counter4 = 0, counter5 = 0;
      double moneyWon;
      String playAgain = "";
      int slotNumber;
            
      Scanner keyboard = new Scanner(System.in);
      Random slot = new Random();
      
      do
      {
         System.out.print("Please enter money: $");
         moneyEntered = keyboard.nextDouble();
         
         for (int count = 1; count <= 3; count++)
         {
            slotNumber = slot.nextInt(5);
            
            switch (slotNumber)
            {
               case 0:
                  System.out.println("Cherries");
                  counter0 += 1;
                  break; 
               case 1:
                  System.out.println("Oranges");
                  counter1 += 1;
                  break; 
               case 2:
                  System.out.println("Plums");
                  counter2 += 1;
                  break; 
               case 3:
                  System.out.println("Bells");
                  counter3 += 1;
                  break; 
               case 4:
                  System.out.println("Melons");
                  counter4 += 1;
                  break; 
               default:
                  System.out.println("Bars");
                  counter5 += 1;
            }
         }   
         if (counter0 == 2 || counter1 == 2 || counter2 == 2 ||
             counter3 == 2 || counter4 == 2 || counter5 == 2)
         {
            moneyWon = moneyEntered * 2.0;
            System.out.printf("Congratulations! You won $%.2f!\n", moneyWon);
         }
         else if (counter0 == 3 || counter1 == 3 || counter2 == 3 ||
                  counter3 == 3 || counter4 == 3 || counter5 == 3)  
         {
            moneyWon = moneyEntered * 3.0;
            System.out.printf("Congratulations! You won $%.2f!\n", moneyWon);  
         }
         else
         {
            moneyWon = 0.0;
            System.out.printf("You won $%.2f\n", moneyWon);
         }
            
         System.out.print("Would you like to play again?: ");
         keyboard.nextLine();
         playAgain = keyboard.nextLine();
         
      } while (playAgain.equals("Yes") || playAgain.equals("yes"));
   }
}              
                        
                               
         