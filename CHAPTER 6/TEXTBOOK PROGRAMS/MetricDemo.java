import java.util.Scanner;
import java.text.DecimalFormat;

public class MetricDemo
{
   public static void main(String[] args)
   {
      double miles,
             kilos;
             
      Scanner keyboard = new Scanner(System.in);
      
      DecimalFormat fmt = new DecimalFormat("0.00");
      
      System.out.print("Enter a distance in miles: ");
      miles = keyboard.nextDouble();
      
      kilos = Metric.milesToKilometers(miles);
      System.out.println(fmt.format(miles)
                     + " miles equals " + fmt.format(kilos)
                     + " kilometers.");
      
      System.out.print("Enter a distance in kilometers: ");
      kilos = keyboard.nextDouble();
      
      miles = Metric.kilometersToMiles(kilos);
      System.out.println(fmt.format(kilos)
                     + " kilometers equals " + fmt.format(miles)
                     + " miles.");
   }
}                                              