package calc.strategy;

import java.util.Stack;

import calc.oper.IOperator;

public class NumberStrategy implements ICalculationStrategy {

	private static NumberStrategy st = new NumberStrategy();

	private NumberStrategy() {
	}

	public static NumberStrategy getInstance() {
		return st;
	}

	@Override
	public void calculate(String val, IOperator op, Stack<Double> stack) {
		try {
			stack.push(Double.parseDouble(val));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid Number");
		}
	}

}