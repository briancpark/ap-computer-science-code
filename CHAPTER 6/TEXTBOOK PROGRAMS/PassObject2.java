public class PassObject2
{
   public static void main(String[] args)
   {
      InventoryItem item = new InventoryItem("Wrench", 20);
      
      System.out.println("The contents of items are:");
      System.out.println("Description: "
                         + item.getDescription()
                         + "   Units: " + item.getUnits());
      
      changeItem(item);
      
      System.out.println();
      System.out.println("Now the contents of item are:");
      System.out.println("Description: "
                         + item.getDescription()
                         + "  Units: " + item.getUnits());
   }
   
   public static void changeItem(InventoryItem i)
   {
      i.setDescription("Hammer");
      i.setUnits(5);
   }
}                                               