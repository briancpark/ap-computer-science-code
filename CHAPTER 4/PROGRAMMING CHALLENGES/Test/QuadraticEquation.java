//1. FRQ

public class QuadraticEquation
{
   private double coefficientA;
   private double coefficientB;
   private double coefficientC;
   
   //Constructor
   public QuadraticEquation(double a, double b, double c)
   {
      coefficientA = a;
      coefficientB = b;
      coefficientC = c;
   }
   
   //Mutator methods
   public void setCoefficientA(double a)
   {
      coefficientA = a;
   }   
   
   public void setCoefficientB(double b)
   {
      coefficientB = b;
   }   
   
   public void setCoefficientC(double c)
   {
      coefficientC = c;
   }   
   
   //Accessor methods
   public double getCoefficientA()
   {
      return coefficientA;
   }   
   
   public double getCoefficientB()
   {
      return coefficientB;
   }   
   
   public double getCoefficientC()
   {
      return coefficientC;
   }   
   
   //Methods for calculating solutions
   public boolean hasSolutions()
   {
      double discriminant = 0.0;
      discriminant = Math.pow(coefficientB, 2) - (4 * coefficientA * coefficientC);
      if (discriminant < 0)
         return false;
      else 
         return true;
   }
   
   public double getSolution1()
   {
      double solution1 = 0;
      double solution2 = 0;
      solution1 = ((-coefficientB) + Math.sqrt(Math.pow(coefficientB, 2) - 
                  (4 * coefficientA * coefficientC))) / (2 * coefficientA);
      solution2 = ((-coefficientB) - Math.sqrt(Math.pow(coefficientB, 2) - 
                  (4 * coefficientA * coefficientC))) / (2 * coefficientA);   
      
      if (hasSolutions())
         if (solution1 > solution2)
            return solution2;
         else 
            return solution1;
      else
         return 0.0;
   }
   
   public double getSolution2()
   {
      double solution1 = 0;
      double solution2 = 0;
      solution1 = ((-coefficientB) + Math.sqrt(Math.pow(coefficientB, 2) - 
                  (4 * coefficientA * coefficientC))) / (2 * coefficientA);
      solution2 = ((-coefficientB) - Math.sqrt(Math.pow(coefficientB, 2) - 
                  (4 * coefficientA * coefficientC))) / (2 * coefficientA);   
      
      if (hasSolutions())
         if (solution2 > solution1)
            return solution2;
         else 
            return solution1;
      else
         return 0.0;
   }
}                                       
   