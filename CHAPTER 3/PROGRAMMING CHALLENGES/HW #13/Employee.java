//1. Employee Class

public class Employee
{
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   //No-args constructor   
   public Employee()                
   {
      name = "";
      idNumber = 0;
      department = "";
      position = "";
   }   
   
   //Constructor
   public Employee(String n, int i, String d, String p)
   {
      name = n;
      idNumber = i;
      department = d;
      position = p;
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
   
   public void setDepartment(String d)
   {
      department = d;
   }
   
   public void setPosition(String p)
   {
      position = p;
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
   
   public String getDepartment()
   {
      return department;
   }
   
   public String getPosition()
   {
      return position;
   }
}               