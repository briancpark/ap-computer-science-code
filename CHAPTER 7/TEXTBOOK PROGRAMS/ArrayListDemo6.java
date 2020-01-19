import java.util.ArrayList;

public class ArrayListDemo6
{
   public static void main(String[] args)
   {
      ArrayList<InventoryItem> list = new ArrayLIst<InventoryItem>();
      
      list.add(new InventoryItem("Nuts", 100));
      list.add(new InventoryItem("Bolts", 150));
      list.add(new InventoryItem("Washers", 75));
      
      for (int index = 0; index < list.size(); index++)
      {
         InventoryItem item = (InventoryItem)list.get(index);
         System.out.println("Item at index " + index +
                            "\nDescription: " + item.getDescription() +
                            "\nUnits: " + item.getUnits());
      }
   }
}                            