//2. Car Class

public class Car
{
   private int yearModel;
   private String make;
   private int speed;
   
   //Constructor
   public Car(int y, String m)
   {
      yearModel = y;
      make = m;
      speed = 0;
   }      
   
   //Mutator methods
   public void setYearModel(int y)
   {
      yearModel = y;
   }
   
   public void setMake(String m)
   {
      make = m;
   }
   
   public void setSpeed(int s)
   {
      speed = s;
   }
   
   //Accessor methods
   public int getYearModel()
   {
      return yearModel;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   //Methods for accelerating and breaking
   public void accelerate()
   {
      speed += 5;
   }
   
   public void brake()
   {
      speed -= 5;
   }
}                               
   
   