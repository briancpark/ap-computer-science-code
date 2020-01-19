public class DiceDemo
{
   public static void main(String[] args)
   {
      final int DIE1_SIDES = 6;
      final int DIE2_SIDES = 12;
      
      Die die1 = new Die(DIE1_SIDES);
      Die die2 = new Die(DIE2_SIDES);
      
      System.out.println("This simulates the rolling of a " +
                         DIE1_SIDES + " sided die and a " +
                         DIE2_SIDES + " sided ide.");
      
      System.out.println("Rolling the dice.");
      die1.roll();
      die2.roll();
      
      System.out.println(die1.getValue() + " " +
                         die2.getValue());
   }
}                                               