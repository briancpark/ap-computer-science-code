import javax.swing.JOptionPane;

public class InputAge
{
   public static void main(String[] args)
   {
      String age;
      age = JOptionPane.showInputDialog("Enter Age: ");
      int number;
      number = Integer.parseInt(age);
      System.out.printf("Your are %d years old", number);
   }   
}      