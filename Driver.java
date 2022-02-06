import java.util.Scanner;

/**
 * Demonstrates the use of a stack to create a RPN Calculator.
 */
public class Driver    
{
	/**
	 * Reads, pushes, and evaluates multiple RPN expressions.
	 * Evaluates expression if an operator is entered.
	 * Pushes operands onto the stack until an operator is entered. 
	 */

	public static void main(String[] args)
	{  

		String expression;

		Scanner in = new Scanner(System.in);

		RPNCalc evaluator = new RPNCalc();

		System.out.println("\"h\" or \"?\" bring up the help menu that shows all of the operators.");
		System.out.println("Enter integers to be evaluated or stored by the RPN calculator: ");

		do
		{  

			expression = in.nextLine();
			evaluator.evaluate(expression);
			System.out.println();
	}
		while (in.hasNext());
}
}
