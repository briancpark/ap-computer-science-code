//2. Car Class

public class CarDemo
{
   public static void main(String[] args)
   {
      Car car1 = new Car(2016, "Toyota");
      
      car1.setSpeed(50);
      
      System.out.printf("Car Model: %s %d\n\n", 
                        car1.getMake(), car1.getYearModel());
      
      System.out.println("Current Speed: " + car1.getSpeed());
      
      System.out.println("\nAccelerating...\n");
      //Accelerate 5 times
      car1.accelerate();
      car1.accelerate();
      car1.accelerate();
      car1.accelerate();
      car1.accelerate();
      
      System.out.println("Current Speed: " + car1.getSpeed());
      
      System.out.println("\nBraking...\n");
      //Brake 5 times
      car1.brake();
      car1.brake();
      car1.brake();
      car1.brake();
      car1.brake();
      
      System.out.println("Current Speed: " + car1.getSpeed());
   }
}         