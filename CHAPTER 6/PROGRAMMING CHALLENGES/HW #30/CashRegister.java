//8. CashRegister Class

public class CashRegister
{
   private RetailItem item;
   private int itemQuantity;
   private final double TAX_RATE = .06;
   
   
   //Constructor
   public CashRegister(RetailItem i, int iq)
   {
      item = i;
      itemQuantity = iq;
   }
   
   //Methods for calculating total and tax
   public double getSubtotal()
   {
      return itemQuantity * item.getRetail();
   }
   
   public double getTax()
   {
      return TAX_RATE * getSubtotal();
   }
   
   public double getTotal()
   {
      return getSubtotal() + getTax();
   }
}               
