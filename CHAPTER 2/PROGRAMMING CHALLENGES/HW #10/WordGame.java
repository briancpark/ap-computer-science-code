//17. Word Game

import java.util.Scanner;

public class WordGame
{
   public static void main(String[] args)
   {
      String name, city, college, profession, animal, petName;
      int age;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      name = keyboard.nextLine();
      
      System.out.print("Enter your age: ");
      age = keyboard.nextInt();
      
      keyboard.nextLine();    //This allows for the next input and prevents it from skipping it
      
      System.out.print("Enter name of a city: ");
      city = keyboard.nextLine();
      
      System.out.print("Enter name of a college: ");
      college = keyboard.nextLine();
      
      System.out.print("Enter a profession: ");
      profession = keyboard.nextLine();
      
      System.out.print("Enter a type of animal: ");
      animal = keyboard.nextLine();
      
      System.out.print("Enter a pet's name: ");
      petName = keyboard.nextLine();
      
      System.out.printf("There once was a person named %s who lived in %s. At the age of %d \n" +
                        "%s went to college at %s. %s graduated and went to work as a %s. Then, \n" +
                        "%s adopted a(n) %s named %s. They both lived happily ever after!\n",
                        name, city, age, name, college, name, profession, name, animal, petName);
   }
}
                               
      
      
   
   