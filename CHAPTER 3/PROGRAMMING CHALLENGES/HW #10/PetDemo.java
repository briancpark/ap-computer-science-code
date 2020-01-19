//10. Pet Class

import java.util.Scanner;

public class PetDemo
{
   public static void main(String[] args)
   {
      String name, type;
      int age;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("What is your pet's name?: ");
      name = keyboard.nextLine();
      System.out.print("What is your pet's type?: ");
      type = keyboard.nextLine();
      System.out.print("What is your pet's age?:  ");
      age = keyboard.nextInt();
      
      //Create new object from Pet class
      Pet p1 = new Pet(name, type, age);
      
      System.out.printf("\nYour %s's name is %s and he/she is %d years old.",
                        p1.getType(), p1.getName(), p1.getAge());
   }
}                        
      