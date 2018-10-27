package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 10; i++) {

			String one = JOptionPane
					.showInputDialog("what is the first number would you like to put into your calculator");
			String two = JOptionPane
					.showInputDialog("what is the second number you would like to put into your calculator");
			int num1 = Integer.parseInt(one);
			int num2 = Integer.parseInt(two);
// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "what operation would you like to do?", "Calculator", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
					null);
			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 3) {
				divide(num1, num2);
			}
			if (operation == 2) {
				multiply(num1, num2);
			}
			if (operation == 1) {
				subtract(num1, num2);
			}
			if (operation == 0) {
				add(num1, num2);
			}
			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		}
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	static void subtract(int num1, int num2) {
		int sum = num1 - num2;
		System.out.println(sum);
	}

	static void multiply(int num1, int num2) {
		int sum = num1 * num2;
		System.out.println(sum);
	}

	static void divide(int num1, int num2) {
		int sum = num1 / num2;
		System.out.println(sum);
	}

	// TODO Auto-generated method stub

	// 4. Create similar methods for subtraction, multiplication and division.
}