public class FullName
{
   private String lastName,
                  firstName,
                  middleName;
   
   public void setLastName(String str)
   {
      lastName = str;
   }
   
   public void setFirstName(String str)
   {
      firstName = str;
   }
   
   public void setMiddleName(String str)
   {
      middleName = str;
   }
   
   public int getLength()
   {
      return lastName.length() + firstName.length()
           + middleName.length();
   }
   
   public String toString()
   {
      return firstName + " " + middleName + " "
             + lastName;
   }
}                                             