//5. Hotel Occupancy

import java.util.Scanner;

public class HotelOccupancy
{
   public static void main(String[] args)
   {
      int totalRooms = 0, roomsOccupied = 0, floors, roomsVacant;
      double occupancyRate;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Ask user for information
      System.out.print("How many floors does the hotel have?: ");
      floors = keyboard.nextInt();
      
      //Input validation
      while (floors < 1)
      {
         System.out.println("Invalid input. Please enter number greater than or equal to 1.");
         System.out.print("How many floors does the hotel have?: ");
         floors = keyboard.nextInt();
      }
      
      for (int count = 1; count <= floors; count++)
      {
         int roomsPerFloor, roomsOccupiedPerFloor;
         
         System.out.print("How many rooms are on floor " + count + "?: ");
         roomsPerFloor = keyboard.nextInt();
         
         while (roomsPerFloor < 10)
         {
            System.out.println("Invalid number of rooms. Please enter 10 or more rooms.");
            System.out.print("How many rooms are on floor " + count + "?: ");
            roomsPerFloor = keyboard.nextInt();
         }
         
         totalRooms += roomsPerFloor;
         
         System.out.print("How many rooms are occupied on floor " + count + "?: ");
         roomsOccupiedPerFloor = keyboard.nextInt();
         
         while (roomsOccupiedPerFloor < 0)
         {
            System.out.print("Invalid input. Please enter a positive number.");
            System.out.print("How many rooms are occupied on floor " + count + "?: ");
            roomsOccupiedPerFloor = keyboard.nextInt();
         }
         
         roomsOccupied += roomsOccupiedPerFloor;
      }
      
      roomsVacant = totalRooms - roomsOccupied;
      occupancyRate = (double) roomsOccupied / totalRooms;
      
      //Display total
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
      System.out.printf("Total Number of Rooms:          %d\n" +
                        "Total Number of Rooms Occupied: %d\n" +
                        "Total Number of Rooms Vacant:   %d\n" +
                        "Occupancy Rate:                 %.2f\n",
                        totalRooms, roomsOccupied, roomsVacant, occupancyRate);
   }
}                               
            
         