//2. InventoryItem Class Copy Constructor

public class InventoryItem
{
   private String description;
   private int units;
   
   public InventoryItem()
   {
      description = "";
      units = 0;
   }
   
   public InventoryItem(String d)
   {
      description = d;
      units = 0;
   }
   
   public InventoryItem(String d, int u)
   {
      description = d;
      units = u;
   }
   
   public InventoryItem(InventoryItem object2)
   {
      description = object2.description;
      units = object2.unit;
   }   
   
   public void setDescription(String d)
   {
      description = d;
   }
   
   public void setUnits(int u)
   {
      units = u;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getUnits()
   {
      return units;
   }
}
