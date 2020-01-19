//16. Energy Drink Consumption

public class EnergyDrinkConsumption
{
   public static void main(String[] args)
   {
      double customersSurveyed = 15000;      //Number of customers surveyed
      double percentagePurchase = .18;       //Percentage who purchase one or more energy drinks
      double percentageFlavored = .58;       //Percentage who like citrus flavored drinks
      
      double customersPurchase, customersFlavor;
      
      customersPurchase = customersSurveyed * percentagePurchase;
      customersFlavor = customersSurveyed * percentageFlavored;
      
      System.out.printf("%.0f customers in the survey purchase one or more energy drinks per week\n" +
                        "%.0f customers in the survey prefer citrus flavored energy drinks\n", 
                        customersPurchase, customersFlavor);
   }
}                        