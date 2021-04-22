import java.util.Scanner;
public class InputOutput
{
  public static void main (String [] args)
  {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please input a number: ");
      int number = keyboard.nextInt();
      System.out.println();
      System.out.println(number);

      System.out.print("Please input a decimal: ");
      double decimal = keyboard.nextDouble();
      System.out.println();
      System.out.println(decimal);

      System.out.print("Please enter a string: ");
      String input = keyboard.next();
       System.out.println();
      System.out.println(input);

      System.out.println("Please enter a line of text: ");
      String line = keyboard.nextLine();
      System.out.println();
       System.out.println(line);
  }
}
