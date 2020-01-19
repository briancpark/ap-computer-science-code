//17. Hot Dog Cookout Calculator

import java.util.Scanner;

public class HotDogCookoutCalculator
{
   public static void main(String[] args)
   {
      int people, hotDogs, totalHotDogs;
      final int HOT_DOG_PACKAGES = 10;
      final int HOT_DOG_BUN_PACKAGES = 8;
      int minimumHotDog, minimumHotDogBun, 
          hotDogLeftOvers, hotDogBunLeftOvers;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("How many people are attending to the cookout?: ");
      people = keyboard.nextInt();
      System.out.print("How many hot dogs will each person be eating?: ");
      hotDogs = keyboard.nextInt();
      
      totalHotDogs = hotDogs * people;
      
      minimumHotDog = totalHotDogs / HOT_DOG_PACKAGES;
      minimumHotDogBun = totalHotDogs / HOT_DOG_BUN_PACKAGES;
      
      if ((totalHotDogs % HOT_DOG_PACKAGES) > 0)
         minimumHotDog += 1;
      hotDogLeftOvers = (minimumHotDog * HOT_DOG_PACKAGES) - totalHotDogs;
      
      if ((totalHotDogs % HOT_DOG_BUN_PACKAGES) > 0)
         minimumHotDog += 1;
      hotDogBunLeftOvers = (minimumHotDogBun * HOT_DOG_BUN_PACKAGES) - totalHotDogs;
      
      //Display information
      System.out.printf("The minimum number of packages of hot dogs required: %d\n" +
                        "The minimum number of packages of buns required: %d\n" +
                        "The number of hot dogs that will be left over: %d\n" +
                        "The number of buns that will be left over: %d\n",
                        minimumHotDog, minimumHotDogBun, hotDogLeftOvers,
                        hotDogBunLeftOvers);
   }
}                        
                        
      
    