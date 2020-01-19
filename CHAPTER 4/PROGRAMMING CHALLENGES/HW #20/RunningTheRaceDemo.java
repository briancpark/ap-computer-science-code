//8. Running the Race

import java.util.Scanner;

public class RunningTheRaceDemo
{
   public static void main(String[] args)
   {
      String n_1, n_2, n_3;
      double t_1, t_2, t_3;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("Enter runner 1's name: ");
      n_1 = keyboard.nextLine();
      System.out.print("Enter runner 2's name: ");
      n_2 = keyboard.nextLine();
      System.out.print("Enter runner 3's name: ");
      n_3 = keyboard.nextLine();
      
      System.out.print("Enter runner 1's time:");
      t_1 = keyboard.nextDouble();
      System.out.print("Enter runner 2's time:");
      t_2 = keyboard.nextDouble();
      System.out.print("Enter runner 3's time:");
      t_3 = keyboard.nextDouble();
      
      //Create new object
      RunningTheRace user = new RunningTheRace(n_1, n_2, n_3, t_1, t_2, t_3);
      
      //Display information
      System.out.print(user.Place());
      
   }
}      
        