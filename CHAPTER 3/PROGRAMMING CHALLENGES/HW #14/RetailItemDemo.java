//5. RetailItem Class

public class RetailItemDemo
{
   public static void main(String[] args)
   {
      //Create instances
      RetailItem item1 = new RetailItem();
      RetailItem item2 = new RetailItem();
      RetailItem item3 = new RetailItem();
      
      //Setting descriptions of each item
      item1.setDescription("Jacket");
      item1.setUnitsOnHand(12);
      item1.setPrice(59.95);
      
      item2.setDescription("Designer Jeans");
      item2.setUnitsOnHand(40);
      item2.setPrice(34.95);
      
      item3.setDescription("Shirt");
      item3.setUnitsOnHand(20);
      item3.setPrice(24.95);
      
      //Display each item
      
      System.out.printf("Item #1\n\nDescription: %s\nUnits On Hand: %d\n" +
                        "Price: $%.2f\n\n\n", item1.getDescription(),
                        item1.getUnitsOnHand(), item1.getPrice());
                        
      System.out.printf("Item #2\n\nDescription: %s\nUnits On Hand: %d\n" +
                        "Price: $%.2f\n\n\n", item2.getDescription(),
                        item2.getUnitsOnHand(), item2.getPrice());
                        
      System.out.printf("Item #3\n\nDescription: %s\nUnits On Hand: %d\n" +
                        "Price: $%.2f", item3.getDescription(),
                        item3.getUnitsOnHand(), item3.getPrice());
   }
}                                             