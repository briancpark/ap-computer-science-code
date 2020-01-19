public class PassObject
{
   public static void main(String[] args)
   {
      InventoryItem item = new InventoryItem("Wrench", 20);
      
      displayItem(item);
   }
   
   public static void displayItem(InventoryItem i)
   {
      System.out.println("Description: " + i.getDescription());
      System.out.println("Units: " + i.getUnits());
   }
}         