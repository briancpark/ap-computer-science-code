//11. Mobile Service Provider

public class MobileServiceProvider
{
   private final double PACKAGE_A = 39.99;
   private final double PACKAGE_B = 59.99;
   private final double PACKAGE_C = 69.99;
   private String packages;
   private double minutes;
   
   //Constructor
   public MobileServiceProvider(String p, double m)
   {
      packages = p;
      minutes = m;
   }
   
   //Mutator methods
   public void setPackages(String p)
   {
      packages = p;
   }
   
   public void setMinutes(double m)
   {  
      minutes = m;
   }
   
   //Accessor methods
   public String getPackages()
   {
      return packages;
   }
   
   public double getMinutes()
   {
      return minutes;
   }
   
   //Methods calculating monthly bill depending on package
   public double totalCharges()
   {
      double cost = 0.0;
      
      switch (packages)
      {  
         case "a":
         case "A":
            if (minutes <= 450)
            {
               cost = PACKAGE_A;
            }
            else
            {
               cost = PACKAGE_A + (.45 * (minutes - 450));  
            }
            break;      
         case "b":
         case "B":
            if (minutes <= 900)
            {
               cost = PACKAGE_B;
            }
            else
            {
               cost = PACKAGE_B + (.40 * (minutes - 900));   
            }  
            break;   
         case "c":
         case "C":
            cost = PACKAGE_C;
            break;
         default:
            cost = 0.0;
      }   
      return cost;         
   }
}                           
                              
      