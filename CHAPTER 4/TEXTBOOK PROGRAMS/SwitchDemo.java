import java.util.Scanner;

public class SwitchDemo
{
   public static void main(String[] args)
   {
      String input;
      char choice;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter A, B , or C: ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      
      switch (choice)
      {
         case 'A':
            System.out.println("You entered A.");
            break;
         case 'B':
            System.out.println("You entered B.");
            break;
         case 'C':
            System.out.println("You entered C.");
            break;
         default:
            System.out.println("That's not A, B, or C!");
      }
   }
}                     