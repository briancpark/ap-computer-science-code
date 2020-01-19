public class Tester
{
   public static void main(String[] args)
   {
      double result = 1;
      
      if (result >= 0)
         System.out.println("The result is positive.");
      else
         System.out.println("The result is negative.");
         
      System.out.print("The result is " + (result >= 0 ? "positive" : "negative"));
   }
}            