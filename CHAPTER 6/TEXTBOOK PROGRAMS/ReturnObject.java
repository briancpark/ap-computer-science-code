import java.util.Scanner;


public class ReturnObject
{
   public static void main(String[] args)
   {
      InventoryItem item;
      
      item = getData();
      
      System.out.println("Here is the data you entered:");
      System.out.println("Description: "
                         + item.getDescription()
                         + "  Units: " + item.getUnits());
   }
   
   public static InventoryItem getData()
   {
      String desc;
      int units;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter an item description: ");
      desc = keyboard.nextLine();
      
      System.out.print("Enter a number of units: ");
      units = keyboard.nextInt();
      
      return new InventoryItem(desc, units);
   }
}                            