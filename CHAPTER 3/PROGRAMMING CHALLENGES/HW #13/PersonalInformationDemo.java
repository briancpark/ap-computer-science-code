//3. Personal Information Class

public class PersonalInformationDemo
{
   public static void main(String[] args)
   {
      //Create personal information objects
      PersonalInformation brian = new PersonalInformation();
      PersonalInformation grandfather = new PersonalInformation();
      PersonalInformation cannonSchool = new PersonalInformation();
      
      //Instances of three people
      brian.setName("Brian Park");
      brian.setAddress("3319 Grandeur Rd 28269 Charlotte, NC");
      brian.setAge(18);
      brian.setPhoneNumber("9802551332");
      
      grandfather.setName("Moon Sung Ryul");
      grandfather.setAddress("1614-15 Seocho il-dong Seoul, South Korea");
      grandfather.setAge(80);
      grandfather.setPhoneNumber("01182114768006");
      
      cannonSchool.setName("Cannon School");
      cannonSchool.setAddress("5801 Poplar Tent Rd 28027 Concord, NC");
      cannonSchool.setAge(1969);
      cannonSchool.setPhoneNumber("7047868171");
      
      //Display information of the instances
      System.out.printf("Person 1:\nName: %s\nAddress: %s\n" +
                        "Age: %d\nPhone Number: %s\n\n", 
                        brian.getName(), brian.getAddress(),
                        brian.getAge(), brian.getPhoneNumber());
      
      System.out.printf("Person 2:\nName: %s\nAddress: %s\n" +
                        "Age: %d\nPhone Number: %s\n\n", 
                        grandfather.getName(), grandfather.getAddress(),
                        grandfather.getAge(), grandfather.getPhoneNumber());
      
      System.out.printf("Person 3:\nName: %s\nAddress: %s\n" +
                        "Age: %d\nPhone Number: %s\n\n", 
                        cannonSchool.getName(), cannonSchool.getAddress(),
                        cannonSchool.getAge(), cannonSchool.getPhoneNumber());                                    
   }
}      