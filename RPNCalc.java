import java.util.*;

/**
 * Represents an integer evaluator of RPN expressions. Assumes 
 * the operands are constants.
 */


public class RPNCalc
{
	private Stack<Integer> stack;
	
	
	/**
	 * Sets up this evaluator by creating a new stack.
	 */
	public RPNCalc()
	{
		stack = new Stack<Integer>();   
	}

	/**
	 * Evaluates the specified RPN expression. If an operand is
	 * encountered, it is pushed onto the stack. If an operator is
	 * encountered, the operation is evaluated, and the result is 
	 * pushed onto the stack.
	 * @param expr string representation of a RPN expression
	 */
	public void evaluate(String expr)
	{
		String token;
		Scanner parser = new Scanner(expr);

		while (parser.hasNext())
		{
			token = parser.next();

			if (isOperator(token))
			{

				evaluateSingleOperator(token.charAt(0));
			}
			else
				stack.push(new Integer(Integer.parseInt(token)));
		}
	}

	/**
	 * Determines if the specified token is an operator.
	 * @param token the token to be evaluated 
	 * @return true if token is operator
	 */
	private boolean isOperator(String token)
	{
		return ( token.equals("+") || token.equals("-") ||
				token.equals("*") || token.equals("/") ) || token.equals("%") || token.equals("m") 
				|| token.equals("r") || token.equals("d") || token.equals("p") || 
				token.equals("n") || token.equals("f") || token.equals("c") || 
				token.equals("h") || token.equals("?") || token.equals("q");
	}

	/**
	 * Performs integer evaluation on a single expression consisting of 
	 * the specified operator and operands.
	 * @param operation operation to be performed
	 */
	private void evaluateSingleOperator(char operation) 
	{

		switch (operation)
		{
		case '+':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			}
			stack.push(stack.pop() + stack.pop());  
			break;
		case '-':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} int scnd = stack.pop();
			int frst = stack.pop();
			stack.push(frst - scnd);
			break;
		case '*':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} stack.push(stack.pop() * stack.pop());
			break;
		case '/':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} int second = stack.pop();
			int first = stack.pop();
			try {
				if (second == 0);
			} catch(Exception e) { 
				System.out.println("Error: Divide by zero");          
			}
			stack.push(first / second);
			break;
		case '%':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} int op2 = stack.pop();
			int op1 = stack.pop();
			try {
				if (op2 == 0);
			} catch(Exception e) { 
				System.out.println("Error: Divide by zero");          
			}
			stack.push(op1 % op2);
			break;
		case 'm':
			try {
				if (stack.size() < 1);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} int top = stack.pop();
			stack.push(-top);
			break;
		case 'r':
			try {
				if (stack.size() < 2);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} int op4 = stack.pop();
			int op3 = stack.pop();
			stack.push(op4);
			stack.push(op3);
			break;
		case 'd':
			try {
				if (stack.size() < 1);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} stack.push(stack.peek());
			break;
		case 'p':
			try {
				if (stack.size() < 1);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} System.out.println(stack.peek());
			break;
		case 'n':
			try {
				if (stack.size() < 1);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			} System.out.println(stack.pop());
			break;
		case 'f':
			try {
				if (stack.size() < 1);
			} catch(Exception e) {
				System.out.println("Error: Too many operators");
			}
			for (int i = 0; i < stack.size(); i++) {
				System.out.print(stack.get(i) + " ");
			}
			break;
		case 'c':
			try {
				if (stack.isEmpty() == true);
			} catch(Exception e) {
				System.out.println("Error: Empty Stack");
			}
			stack.clear();
			break;
		case 'q':
			System.out.println("Thanks!");
			System.exit(0);
			break;
		case 'h':
			System.out.println("Help Message!!!");
			System.out.println("+ : add");
			System.out.println("* : multiply");
			System.out.println("/ : division");
			System.out.println("- : substract");
			System.out.println("% : modulus");
			System.out.println("m : unaryMinus");
			System.out.println("r : exchange top two");
			System.out.println("d : duplicate top item");
			System.out.println("p : print top item");
			System.out.println("n : print and remove top item");
			System.out.println("f : print all contents");
			System.out.println("c : clear the stack");
			System.out.println("q : quit");
			System.out.println("h : help");
			System.out.println("? : help");
			break;
		case '?':
			System.out.println("Help Message!!!");
			System.out.println("+ : add");
			System.out.println("* : multiply");
			System.out.println("/ : division");
			System.out.println("- : substract");
			System.out.println("% : modulus");
			System.out.println("m : unaryMinus");
			System.out.println("r : exchange top two");
			System.out.println("d : duplicate top item");
			System.out.println("p : print top item");
			System.out.println("n : print and remove top item");
			System.out.println("f : print all contents");
			System.out.println("c : clear the stack");
			System.out.println("q : quit");
			System.out.println("h : help");
			System.out.println("? : help");
			break;
		default :
			System.out.println("Error: Please try again.");
			break;

		}
	}
}


