//2. Payroll Class

import java.util.Scanner;

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;
      double payRate;
      
      Scanner keyboard = new Scanner(System.in);
      
      Payroll employee = new Payroll();
      
      for (int i = 0; i < 7; i++)
      {
         System.out.print("Hours worked by employee " + employee.getEmployeeIDAt(i) + ": ");
         hours = keyboard.nextInt();
         
         while (hours < 0)
         {
            System.out.println("Invalid input. Cannot accept negative values for hours.");
            System.out.print("Hours worked by employee " + employee.getEmployeeIDAt(i) + ": ");
            hours = keyboard.nextInt();
         }
         
         System.out.print("Payrate for employee " + employee.getEmployeeIDAt(i) + ": ");
         payRate = keyboard.nextDouble();
         
         while (payRate < 6.00)
         {
            System.out.println("Invalid input. Payrate cannot be below minimum wage.");
            System.out.print("Payrate for employee " + employee.getEmployeeIDAt(i) + ": ");
            payRate = keyboard.nextDouble();            
         }   
         
         employee.setHoursAt(i, hours);
         employee.setPayRateAt(i, payRate);
      }   
      
      for (int i = 0; i < 7; i++)
      {
         System.out.printf("Employee ID: %d\nGross Pay $%.2f\n", 
                           employee.getEmployeeIDAt(i),
                           employee.getGrossPay(i));
      }
   }
}                            