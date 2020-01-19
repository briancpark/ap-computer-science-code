public class Numbers
{
   public static void main(String[] args)
   {
      double number = 1234567.456;
      
      System.out.printf("%,.2f\n", number);
      
      double numbers = 123.456;
      
      System.out.printf("%10.1f\n", numbers);
      
      double numbers1 = 123.456;
      
      System.out.printf("%08.1f\n", numbers1);
      
      int numbers2 = 123456;
      
      System.out.printf("%10d\n", numbers2);
      
      double numbers3 = 123456.789;
      
      System.out.printf("%-,20.2f\n", numbers3);
      
      
      String name = "James";
      
      System.out.printf("%20s", name);
      
   }
}      