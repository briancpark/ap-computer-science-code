import java.util.Scanner;
import java.text.DecimalFormat;

public class WeeklyPay
{
   public static void main(String[] args)
   {
      String selection;
      int hours;
      double hourlyRate;
      double yearly;
      
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      System.out.println("Do you want to calculate the " +
                         "weekly salary of an hourly paid");
      System.out.println("or a salaried employee?");
      System.out.print("Enter H for hourly or S for salaried: ");
      selection = keyboard.nextLine();
      
      switch (selection.charAt(0))
      {
         case 'H':
         case 'h':
            System.out.print("How many hours were worked? ");
            hours = keyboard.nextInt();
            System.out.print("What is the hourly pay rate? ");
            hourlyRate = keyboard.nextDouble();
            System.out.println("The weekly gross pay is $" +
               dollar.format(Pay.getWeeklyPay(hours, hourlyRate)));
            break;
         case 'S':
         case 's':
            System.out.print("What is the annual salary? ");
            yearly = keyboard.nextDouble();
            System.out.println("The weekly gross pay is $" +
                  dollar.format(Pay.getWeeklyPay(yearly)));
            break;
         default:
            System.out.println("Invalid selection.");
      }            
   }
}                                                 