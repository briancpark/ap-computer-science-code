public class StringArray
{
   public static void main(String[] args)
   {
      String[] names = { "George", "Susan" };
      int totalLength = 0;
      for (int i = 0; i < names.length(); i++)
         totalLength += names[i].size();
   }
}         