//3. Carpet Calculator

import java.text.DecimalFormat;

public class RoomCarpet
{
   private RoomDimension size; 
   private double carpetCost;
   
   public RoomCarpet(RoomDimension dim, double cost)
   {
      size = new RoomDimension(RoomDimension.length, RoomDimension.width);
      carpetCost = cost;
   }
   
   public double getTotalCost()
   {
      return carpetCost * size.getArea();
   }
   
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#0.00");
      
      String str = "Total cost of the carpet is $" + fmt.format(getTotalCost());
      
      return str;
   }
}         
         