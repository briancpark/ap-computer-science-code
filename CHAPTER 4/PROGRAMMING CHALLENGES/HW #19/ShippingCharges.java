//6. ShippingCharges Class

public class ShippingCharges
{
   private double weight;
   private double milesShipped;
   
   //Constructor
   public ShippingCharges(double w, double m)
   {
      weight = w;
      milesShipped = m;
   }
   
   //Mutator methods
   public void setWeight(double w)
   {
      weight = w;
   }
   
   public void setMilesShipped(double m)
   {
      milesShipped = m;
   }
   
   //Accessor methods
   public double getWeight()
   {
      return weight;
   }
   
   public double getMilesShipped()
   {
      return milesShipped;
   }
   
   //Method for calculating shipping charges
   public double shippingCharges()
   {
      double notProrated;
      double rate;
      
      //If-else-if statement testing the amount for rate
      if (weight <= 2.0)
         rate = 1.1;
      else if (weight > 2.0 && weight <= 6.0)
         rate = 2.2;
      else if (weight > 6.0 && weight <= 10.0)
         rate = 3.7;
      else
         rate = 4.8;
      
      /*The shipping charges per 500 miles are not prorated.
      This statement divides the distance by 500 miles and casts
      it to an int, truncating any decimals after the whole number*/
      notProrated = (int) milesShipped / 500;
      
      /*The next if statement makes sure that the not prorated
      ratio is greater than 0*/
      if (notProrated == 0)
         notProrated = 1;    
      
      //Return the shipping charges
      return rate * notProrated;
   }
}                 
                        