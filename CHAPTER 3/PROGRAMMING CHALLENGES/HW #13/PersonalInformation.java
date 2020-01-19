//3. Personal Information Class

public class PersonalInformation
{
   private String name;
   private String address;
   private int age;
   private String phoneNumber;
   
   //Mutator methods
   public void setName(String n)
   {
      name = n;
   }
   
   public void setAddress(String a)
   {
      address = a;
   }      
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setPhoneNumber(String p)
   {
      phoneNumber = p;
   }
   
   //Accessor methods
   public String getName()
   {
      return name;
   }
   
   public String getAddress()
   {
      return address;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
}                  