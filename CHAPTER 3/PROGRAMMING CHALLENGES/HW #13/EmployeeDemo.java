//1. Employee Class

public class EmployeeDemo
{
   public static void main(String[] args)
   {
      //Create employee objects
      Employee employee1 = new Employee();
      employee1.setName("Susan Meyers");
      employee1.setIDNumber(47899);
      employee1.setDepartment("Accounting");
      employee1.setPosition("Vice President");
      
      Employee employee2 = new Employee();
      employee2.setName("Mark Jones");
      employee2.setIDNumber(39119);
      employee2.setDepartment("IT");
      employee2.setPosition("Programmer");

      Employee employee3 = new Employee();
      employee3.setName("Joy Rogers");
      employee3.setIDNumber(81774);
      employee3.setDepartment("Manufacturing");
      employee3.setPosition("Engineer");

      //Display employee information
      System.out.println("\nEmployee 1");
      System.out.printf("Name: %s\nID Number: %d\n" +
                        "Department: %s\nPosition: %s\n",
                        employee1.getName(), employee1.getIDNumber(),
                        employee1.getDepartment(), employee1.getPosition());
      
      System.out.println("\nEmployee 2");
      System.out.printf("Name: %s\nID Number: %d\n" +
                        "Department: %s\nPosition: %s\n",
                        employee2.getName(), employee2.getIDNumber(),
                        employee2.getDepartment(), employee2.getPosition());
      
      System.out.println("\nEmployee 3");
      System.out.printf("Name: %s\nID Number: %d\n" +
                        "Department: %s\nPosition: %s\n",
                        employee3.getName(), employee3.getIDNumber(),
                        employee3.getDepartment(), employee3.getPosition());                                    
   }
}                        