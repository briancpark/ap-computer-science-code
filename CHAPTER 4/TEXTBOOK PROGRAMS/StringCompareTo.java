import java.util.Scanner;

public class StringCompareTo
{
   public static void main(String[] args)
   {
      String name1, name2;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a name: ");
      name1 = keyboard.nextLine();
      
      System.out.print("Enter a another name: ");
      name2 = keyboard.nextLine();
      
      if (name1.compareTo(name2) < 0)
      {
         System.out.println(name1 + " is less than " + name2);
      }
      else if (name1.compareTo(name2) == 0)
      {
         System.out.println(name1 + " is equal to " + name2);
      }
      else if (name1.compareTo(name2) > 0)
      {
         System.out.println(name1 + " is greater than " + name2);
      }      
   }
}         
         