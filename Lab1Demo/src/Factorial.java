/* Factorial.java
- learn about constants, variables
- Loops
- passing arguments to a static function of the same class
- returning a value from a static function of the same class
- simple arithmetics
*/

public class Factorial
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}