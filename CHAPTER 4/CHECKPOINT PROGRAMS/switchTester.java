public class switchTester
{
   public static void main(String [] args)
   {
      int temp = 12;
      
      switch (temp)
      {
         case temp < 0:
            System.out.println("Temp is negative.");
            break;
         case temp == 0:
            System.out.println("Temp is zero.");
            break;
         case temp > 0:
            System.out.println("Temp is positive.");
            break;
         default:
            System.out.println("Cool");
      }
   }
}                     