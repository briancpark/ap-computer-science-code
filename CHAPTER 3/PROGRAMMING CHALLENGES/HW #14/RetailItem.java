//5. RetailItem Class

public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;
   
   //No-args constructor
   public RetailItem()
   {
      description = "";
      unitsOnHand = 0;
      price = 0.0;
   }   
   
   //Constructor
   public RetailItem(String d, int u, double p)
   {
      description = d;
      unitsOnHand = u;
      price = p;
   }
   
   //Mutator methods
   public void setDescription(String d)
   {
      description = d;
   }      
   
   public void setUnitsOnHand(int u)
   {
      unitsOnHand = u;
   }
   
   public void setPrice(double p)
   {
      price = p;
   }
   
   //Accessor methods
   public String getDescription()
   {
      return description;
   }
   
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
   
   public double getPrice()
   {
      return price;
   }
}                   