//3. Carpet Calculator

import java.util.Scanner;

public class CarpetCalculator
{
   public static void main(String[] args)
   {
      double roomLength, roomWidth, costPerSqFt;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter length of room (in ft): ");
      roomLength = keyboard.nextDouble();
      System.out.print("Enter width of room (in ft): ");
      roomWidth = keyboard.nextDouble();
      System.out.print("Enter cost per sq ft: ");
      costPerSqFt = keyboard.nextDouble();
      
      RoomDimension myRoom = new RoomDimension(roomLength, roomWidth);
      RoomCarpet myCarpet = new RoomCarpet(myRoom, costPerSqFt);
      
      System.out.println(myRoom);
      System.out.println(myCarpet);
   }
}      
      