import java.util.Scanner; 
public class Problem1
{
	public static void main (String [] args)
	{
		System.out.println("How many students are in Mr. James's class?");
		Scanner keyboard = new Scanner (System.in);
		int input = keyboard.nextInt();
		
		int numberOfTimes = input/3;
		int dontFit = input % 3; 
		
		System.out.print("He can make " + numberOfTimes + 
				" full groups and there are " + dontFit 
				+ " remaining students");
	}
}