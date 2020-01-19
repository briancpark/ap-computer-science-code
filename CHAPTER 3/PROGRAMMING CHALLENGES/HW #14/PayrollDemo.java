//Payroll Class

import java.util.Scanner;

public class PayrollDemo
{
   public static void main(String[] args)
   {
      String name;
      int idNumber;
      double payRate;
      double hoursWorked;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user information
      System.out.print("What is your name?: ");
      name = keyboard.nextLine();
      System.out.print("What is your ID Number?: ");
      idNumber = keyboard.nextInt();
      System.out.print("What is your pay rate?: ");
      payRate = keyboard.nextDouble();
      System.out.print("How many hours have you worked?: ");
      hoursWorked = keyboard.nextDouble();
      
      //Create instance
      Payroll user = new Payroll(name, idNumber);
      
      user.setPayRate(payRate);
      user.setHoursWorked(hoursWorked);
      
      //Display information
      System.out.printf("\nHello %s. Your ID Number is %d.\n" +
                        "Your gross pay is $%.2f.",
                        user.getName(), user.getIDNumber(),
                        user.grossPay());
   }
}                           
      
      