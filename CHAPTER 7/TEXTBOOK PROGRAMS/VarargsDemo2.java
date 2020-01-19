public class VarargsDemo2
{
   public static void main(String[] args)
   {
      int total;
      
      InventoryItem item1 = new InventoryItem("Soap", 10);
         
      InventoryItem item2 = new InventoryItem("Shampoo", 20);
      
      InventoryItem item3 = new InventoryItem("Toothpaste", 30); 
      
      total = totalUnits(item1);
      System.out.println("Total: " + total);
      
      total = totalUnits(item1, item2);
      System.out.println("Total: " + total);
      
      total = totalUnits(item1, item2, item3);
      System.out.println("Total: " + total);
   }  
   

   {
      int total;
      
      for (InventoryItem itemObject : items)
         total += itemObject.getUnits();
         
      return total;
   }
}           