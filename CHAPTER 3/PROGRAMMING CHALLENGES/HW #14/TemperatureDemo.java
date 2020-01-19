//4. Temperature Class

import java.util.Scanner;

public class TemperatureDemo
{
   public static void main(String[] args)
   {
      double ftemp;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter Temperature (in Farenheit): ");
      ftemp = keyboard.nextDouble();
      
      Temperature temp = new Temperature(ftemp);
      
      System.out.printf("Temperature in Celsius: %.2f\n" +
                        "Temperature in Kelvin:  %.2f\n",
                        temp.getCelsius(), temp.getKelvin());
   }
}      