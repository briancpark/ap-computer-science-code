//7. RetailItem Class Modification

public class RetailItemDemo
{
   public static void main(String[] args)
   {
      RetailItem item = new RetailItem("Candy bar", 17789,                  
                                       0.75, 1.5);
      
      System.out.println(item);
      System.out.println();
      
      item.setRetail(2);
      item.setWholesale(2);
      
      System.out.println(item);
   }
}      
      
      