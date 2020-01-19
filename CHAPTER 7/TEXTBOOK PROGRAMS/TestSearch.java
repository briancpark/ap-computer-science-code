public class TestSearch
{
   public static void main(String[] args)
   {
      int results;
      
      int[] tests = { 87, 75, 98, 100, 82 };
      
      results = SearchArray.sequentialSearch(tests, 100);
      
      if (results == -1)
      {
         System.out.println("You did not earn 100 "
                            + "on my test.");
      }
      else
      {
         System.out.println("You earned 100 on "
                            + "test " + (results + 1));
      }
   }
}                                                     