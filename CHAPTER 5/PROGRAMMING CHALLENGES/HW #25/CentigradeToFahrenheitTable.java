//13. Centigrade to Fahrenheit Table

public class CentigradeToFahrenheitTable
{
   public static void main(String[] args)
   {
      int centigrade;
      double fahrenheit;
      
      System.out.println("Centigrade                  Fahrenheit");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      
      for (int count = 0; count <= 20; count++)
      {
         centigrade = count;
         fahrenheit = (double) (9.0 / 5.0) * centigrade + 32.0;
         
         System.out.printf("%d\t\t\t\t\t\t\t\t\t\t%.2f\n", centigrade, fahrenheit);
      }
   }
}         
         