/* Factorial.java
- learn about constants, variables
- Loops
- passing arguments to a static function of the same class
- returning a value from a static function of the same class
- simple arithmetics
*/
import javax.swing.JOptionPane;
public class FactorialGUI
{
	public static void main(String[] args)
	{	final int NUM_FACTS = 5;
		for(int i = 0; i < NUM_FACTS; i++)
			JOptionPane.showMessageDialog(null, i + "! is " + factorial(i));
            //System.out.println( i + "! is " + factorial(i));
        
        System.exit(0);
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}