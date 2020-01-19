import java.util.Scanner;

public class GoodStringCompare
{
   public static void main(String[] args)
   {
      String name1, name2, name3;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a name: ");
      name1 = keyboard.nextLine();
      
      System.out.print("Enter a second name: ");
      name2 = keyboard.nextLine();
      
      System.out.print("Enter a third name: ");
      name3 = keyboard.nextLine();
      
      if (name1.equals(name2))
      {
         System.out.println(name1 + " and " + name2
                            + " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name2
                            + " are NOT the same."); 
      }
      
      if (name1.equals(name3))
      {
         System.out.println(name1 + " and " + name3
                            + " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name3
                            + " are NOT the same."); 
      } 
   }
}                                                                       