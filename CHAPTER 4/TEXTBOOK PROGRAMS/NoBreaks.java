import java.util.Scanner;

public class NoBreaks
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
         case 'B':
            System.out.println("You entered B.");
         case 'C':
            System.out.println("You entered C.");
         default:
            System.out.println("That's not A, B, or C!");
      }
   }
}                  