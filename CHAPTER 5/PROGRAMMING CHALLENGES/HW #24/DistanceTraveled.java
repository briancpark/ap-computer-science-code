//2. Distance Traveled

public class DistanceTraveled
{
   private double speed;
   private int time;
   
   //Constructor
   public DistanceTraveled(double s, int t)
   {
      speed = s;
      time = t;
   }
   
   //Mutator methods
   public void setSpeed(double s)
   {
      speed = s;
   }
   
   public void setTime(int t)
   {
      time = t;
   }
   
   //Accessor methods
   public double getSpeed()
   {
      return speed;
   }
   
   public int getTime()
   {
      return time;
   }
   
   //Method for calculating distance
   public double getDistance()
   {
      return speed * time;
   }
}
                     