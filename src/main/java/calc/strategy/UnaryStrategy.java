package calc.strategy;

import java.util.Stack;

import calc.oper.IOperator;
import calc.oper.IUnaryOperator;

public class UnaryStrategy implements ICalculationStrategy {

	private static UnaryStrategy st = new UnaryStrategy();

	private UnaryStrategy() {
	}

	public static UnaryStrategy getInstance() {
		return st;
	}

	@Override
	public void calculate(String val, IOperator op, Stack<Double> stack) {
		if (stack.size() != 1)
			throw new IllegalArgumentException("Stack Size not 1 for Unary Operator");
		else
			stack.push(((IUnaryOperator) op).calculate(stack.pop()));
	}

}
