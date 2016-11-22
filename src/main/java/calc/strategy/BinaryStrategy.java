package calc.strategy;

import java.util.Stack;

import calc.oper.IBinaryOperator;
import calc.oper.IOperator;

public class BinaryStrategy implements ICalculationStrategy {

	private static BinaryStrategy st = new BinaryStrategy();

	private BinaryStrategy() {
	}

	public static BinaryStrategy getInstance() {
		return st;
	}

	@Override
	public void calculate(String val, IOperator op, Stack<Double> stack) {
		if (stack.size() < 2)
			throw new IllegalArgumentException("Stack Size not 2 for Binary Operator");
		else {
			Double b = stack.pop();
			Double a = stack.pop();
			stack.push(((IBinaryOperator) op).calculate(a, b));
		}
	}

}