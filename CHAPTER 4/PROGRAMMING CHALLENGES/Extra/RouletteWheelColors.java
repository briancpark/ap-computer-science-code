//18. Roulette Wheel Colors

public class RouletteWheelColors
{
   private int pocketNumber;
   
   public RouletteWheelColors(int p)
   {
      pocketNumber = p;
   }
   
   public void setPocketNumber(int p)
   {
      pocketNumber = p;
   }
   
   public int getPocketNumber()
   {
      return pocketNumber;
   }
   
   public String getPocketColor()
   {
      String pocketColor;
      
      if (pocketNumber == 0)
         return "green";
      else if (pocketNumber >= 1 && pocketNumber <= 10)
         switch (pocketNumber)
         {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
               pocketColor = "red";
               break;
            default:
               pocketColor = "black";
         }
      else if (pocketNumber >= 11 && pocketNumber <= 18)
         switch (pocketNumber)
         {
            case 11:
            case 13:
            case 15:
            case 17:
               pocketColor = "black";
               break;
            default:
               pocketColor = "red";
         }
      else if (pocketNumber >= 19 && pocketNumber <= 28)
         switch (pocketNumber)
         {
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
               pocketColor = "red";  
               break;
            default:
               pocketColor = "black";
         }        
      else
         switch (pocketNumber)
         {
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
               pocketColor = "red";  
               break;
            default:
               pocketColor = "black";
         }
         
      return pocketColor;   
   }
}         