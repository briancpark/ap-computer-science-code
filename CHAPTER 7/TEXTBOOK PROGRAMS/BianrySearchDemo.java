import java.util.Scanner;

public class BianrySearchDemo
{
   public static void main(String[] args)
   {
      int result,
          searchValue;
      String again;
      
      Scanner keyboard = new Scanner(System.in);
      
      int numbers[] = { 101, 142, 147, 189, 199, 207, 222,
                        234, 289, 296, 310, 319, 388, 394,
                        417, 429, 447, 521, 536, 600 };
      
      do 
      {
         System.out.print("Enter a value to search for: ");
         searchValue = keyboard.nextInt();
         
         result = ArrayTools.binarySearch(numbers, searchValue);
         
         if (result == -1)
            System.out.println(searchValue + " was not found.");
         else
         {
            System.out.println(searchValue + " was found at "
                               + "element " + result);
         }
         
         keyboard.nextLine();  
         
         System.out.print("Do you want to search again? (Y or N): ");
         again = keyboard.nextLine();
      }  while (again.charAt(0) == 'y' || again.charAt(0) == 'Y');
   }
}                                                         