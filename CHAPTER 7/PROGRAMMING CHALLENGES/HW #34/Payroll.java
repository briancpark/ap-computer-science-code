//2. Payroll Class

public class Payroll
{
   private final int NUM_EMPLOYEES = 7;
   private int[] employeeID = { 5658845, 4520125, 7895122, 8777541,
                                8451277, 1302850, 7580489 };
   private int[] hours = new int[NUM_EMPLOYEES];
   private double[] payRate = new double[NUM_EMPLOYEES];
   private double[] wages = new double[NUM_EMPLOYEES];
   
   public double getGrossPay(int i)
   {
      for(int index = 0; index < employeeID.length; index++)
      {
         wages[index] = hours[index] * payRate[index];
      }   
      
      return wages[i];
   }
   
   public void setEmployeeIDAt(int i, int id)
   {
     employeeID[i] = id;
   }
   
   public void setHoursAt(int i, int h)
   {
      hours[i] = h;
   }
   
   public void setPayRateAt(int i, double p)
   {
      payRate[i] = p;
   }
   
   public void setWagesAt(int i, double w)
   {
      wages[i] = w;
   }
   
   public int getEmployeeIDAt(int i)
   {
      return employeeID[i];
   }
   
   public int getHoursAt(int i)
   {
      return hours[i];
   }
   
   public double getPayRateAt(int i)
   {
      return payRate[i];
   }
   
   public double getWagesAt(int i)
   {
      return wages[i];
   }
}              
   
           