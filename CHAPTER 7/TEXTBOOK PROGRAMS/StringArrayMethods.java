public class StringArrayMethods
{
   public static void main(String[] args)
   {
      String[] names = { "Bill", "Susan",
                         "Steven", "Jean" };
      
      for (int index = 0; index < names.length; index++)
         System.out.println(names[index].toUpperCase());
   }
}                            