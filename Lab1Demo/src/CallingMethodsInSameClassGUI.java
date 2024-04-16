/* CallingMethodsInSameClass.java
 - illustrates how to call static methods a class from a method in the same class
 */
import javax.swing.JOptionPane;

public class CallingMethodsInSameClassGUI
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		JOptionPane.showMessageDialog(null, "Hello World");
        //System.out.println("Hello World");
        System.exit(0);
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

  
}