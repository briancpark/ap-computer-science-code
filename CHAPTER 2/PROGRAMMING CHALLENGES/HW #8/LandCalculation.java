//6. Land Calculation

public class LandCalculation
{
   public static void main(String[] args)
   {
      double landSquareFeet = 43560;     //number of sq ft in land
      double squareFeet = 389767;        //number of sq ft in an acre      
      double acres;
      
      acres = landSquareFeet / squareFeet;
      
      System.out.printf("Number of acres for the tract of land is %f acres.", acres);
   }
}      