//6. Payroll Class

public class Payroll
{
   private String name;
   private int idNumber;
   private double payRate;
   private double hoursWorked;
   
   //Construuctor
   public Payroll(String n, int i)
   {
      name = n;
      idNumber = i;
   }
   
   //Mutator methods
   public void setName(String n)
   {
      name = n;
   }
   
   public void setIDNumber(int i)
   {
      idNumber = i;
   }
   
   public void setPayRate(double p)
   {
      payRate = p;
   }
   
   public void setHoursWorked(double h)
   {
      hoursWorked = h;
   }
   
   //Accessor methods
   public String getName()
   {
      return name;
   }
   
   public int getIDNumber()
   {
      return idNumber;
   }
   
   public double getPayRate()
   {
      return payRate;
   }
   
   public double getHoursWorked()
   {
      return hoursWorked;
   }
   
   //Method for calculating gross pay
   public double grossPay()
   {
      return (double) hoursWorked * payRate;
   }
}                                