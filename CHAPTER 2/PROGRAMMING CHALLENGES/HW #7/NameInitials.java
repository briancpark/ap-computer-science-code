//2. Name and Initials

public class NameInitials
{
   public static void main(String[] args)
   {
      String firstName = "Brian";
      String middleName = "Changeun";
      String lastName = "Park";
      
      char firstInitial = firstName.charAt(0);
      char middleInitial = middleName.charAt(0);
      char lastInitial = lastName.charAt(0);
      
      System.out.println(firstName + " " + middleName + " " + lastName);
      System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
   }
}      