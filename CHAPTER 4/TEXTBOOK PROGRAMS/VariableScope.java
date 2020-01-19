import java.util.Scanner;

public class VariableScope
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your first name: ");
      String firstName;
      firstName = keyboard.nextLine();
      
      System.out.print("Enter your last name: ");
      String lastName;
      lastName = keyboard.nextLine();
      
      System.out.println("Hello " + firstName
                         + " " + lastName);
   }
}                         