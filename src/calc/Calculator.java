package calc;

import java.util.Stack;

import calc.factory.CalculatorFactory;

public class Calculator {

	public Double calculate(String arg) {
		if (arg == null)
			throw new IllegalArgumentException("Null Input");

		String[] vals = arg.split(",");
		Stack<Double> stack = new Stack<>();
		for (int i = 0; i < vals.length; i++) {
			CalculatorFactory.getInstance().getStuff(vals[i]).calculate(stack);
		}

		return checkOut(stack);
	}

	private Double checkOut(Stack<Double> stack) {
		if (stack.size() == 1)
			return stack.pop();
		else
			throw new IllegalArgumentException("Got Unused Numbers");
	}

}
