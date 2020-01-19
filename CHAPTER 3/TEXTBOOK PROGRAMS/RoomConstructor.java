import java.util.Scanner;

public class RoomConstructor
{
   public static void main(String[] args)
   {
      double roomLength,
             roomWidth,
             totalArea;
      
      Rectangle kitchen, bedroom, den;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the kitchen's length? ");
      roomLength = keyboard.nextDouble();
      System.out.print("What is the kitchen's width? ");
      roomWidth = keyboard.nextDouble();
      kitchen = new Rectangle(roomLength, roomWidth);
      
      System.out.print("What is the bedroom's length? ");
      roomLength = keyboard.nextDouble();
      System.out.print("What is the bedroom's width? ");
      roomWidth = keyboard.nextDouble();
      bedroom = new Rectangle(roomLength, roomWidth);
      
      System.out.print("What is the den's length? ");
      roomLength = keyboard.nextDouble();
      System.out.print("What is the den's width? ");
      roomWidth = keyboard.nextDouble();
      den = new Rectangle(roomLength, roomWidth);
      
      totalArea = kitchen.getArea() + bedroom.getArea()
                  + den.getArea();
                  
      System.out.println("The total area of the rooms is "
                        + totalArea);
   }
}                                    