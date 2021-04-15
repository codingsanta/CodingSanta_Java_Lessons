public class Methods
{
	public static void main(String [] args)
	{
		helloMethod(); // "hello there" x 3

		System.out.println(getName()); // Santa

		System.out.println(multiply(3, 4)); // 12
		System.out.println(add(3.0, 4.0));  // 7.0
	
		System.out.println(multiply(3, 4, 5));  // 60
		System.out.println(multiply(3.0, 4.0)); // 12.0
	}

	public static double add(double first, double second)
	{
		return first + second;
	}

	public static double multiply(double first, double second)
	{
		return first * second;
	}

	public static int multiply(int first, int second, int third)
	{
		return first * second * third;
	}

	public static int multiply(int first, int second)
	{
		return first * second;
	}

	public static String getName()
	{
		System.out.println("This method has been called.");
		return "Santa";
	}

	public static void helloMethod()
	{
		System.out.println("hello there");
		System.out.println("hello there");
		System.out.println("hello there");
	}
}
