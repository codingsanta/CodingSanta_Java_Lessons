/*
 * Here is the solution code. Change the file to
 * "Password.java" if you plan to run the program.
 */

import java.util.Scanner;

public class Password
{
	public static void main(String [] args)
	{
		System.out.println();

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the key for the first code: ");
		int firstKey = keyboard.nextInt();
		System.out.print("Enter the key for the second code: ");
		double secondKey = keyboard.nextDouble();
		System.out.print("Enter the key for the third code: ");
		int thirdKey = keyboard.nextInt();
		System.out.print("Enter the key for the fourth code: ");
		String fourthKey = keyboard.next();
		System.out.print("Enter the encryption pin: ");
		int encryptionPin = keyboard.nextInt();
		System.out.println();

		System.out.print("Passcode: ");
		System.out.print(firstCode(firstKey) + " ");
		System.out.print(secondCode(secondKey) + " ");
		System.out.print(thirdCode(thirdKey) + " ");
		System.out.print(fourthCode(fourthKey, encryptionPin));
		System.out.println();

		System.out.println();
	}
	public static int firstCode(int key)
	{
		return key + key * key;
	}
	public static double secondCode(double key)
	{
		return key * (key - 1.0) * (key - 2.0);
	}
	public static int thirdCode(int key)
	{
		return key % 4;
	}
	public static String fourthCode(String name, int encryption)
	{
		return name + encryption;
	}
}
