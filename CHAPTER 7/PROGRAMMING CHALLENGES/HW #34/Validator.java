//3. Charge Account Validation

public class Validator
{
   private int valid[] = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                           8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                           1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
   
   public static int sequentialSearch(int[] array, int value)
   {
      int index, element;
      boolean found;
      
      index = 0;
      
      element = -1;
      found = false;
      
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            element = index;
         }
         
         index++;
      }
      
      return element;
   }
}               
         
            
      
      
      