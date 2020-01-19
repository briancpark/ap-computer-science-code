public class SelectionSortDemo
{
   public static void main(String[] args)
   {
      int[] values = { 5, 7, 2, 8, 9, 1 };
      
      System.out.println("The unsorted values are:");
      for (int index = 0; index < values.length; index++)
         System.out.print(values[index] + " ");
      System.out.println();
      
      ArrayTools.selectionSort(values);
      
      System.out.println("The sorted values are:");
      for (int index = 0; index < values.length; index++)
         System.out.print(values[index] + " ");
   }
}                        