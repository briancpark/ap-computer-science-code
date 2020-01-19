import java.util.Scanner;

public class RoomAreas
{
   public static void main(String[] args)
   {
      double number,
             totalArea;
             
      Scanner keyboard = new Scanner(System.in);
      
      Rectangle kitchen = new Rectangle();
      Rectangle bedroom = new Rectangle();
      Rectangle den = new Rectangle();
      
      System.out.print("What is the kitchen's length? ");
      number = keyboard.nextDouble();
      kitchen.setLength(number);
      System.out.print("What is the kitchen's width? ");
      number = keyboard.nextDouble();
      kitchen.setWidth(number);
      
      System.out.print("What is the bedroom's length? ");
      number = keyboard.nextDouble();
      bedroom.setLength(number);
      System.out.print("What is the bedroom's width? ");
      number = keyboard.nextDouble();
      bedroom.setWidth(number);
      
      System.out.print("What is the den's length? ");
      number = keyboard.nextDouble();
      den.setLength(number);
      System.out.print("What is teh den's width? ");
      number = keyboard.nextDouble();
      den.setWidth(number);
      
      totalArea = kitchen.getArea() + bedroom.getArea()
                  + den.getArea();
      
      System.out.println("The total area of the room is "
                        + totalArea);
   }
}                                    