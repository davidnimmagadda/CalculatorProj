package calc.factory;

import java.util.Stack;

import calc.oper.IOperator;
import calc.strategy.ICalculationStrategy;

public class Out {
	ICalculationStrategy strategy;
	IOperator operator;
	String val;

	public Out(ICalculationStrategy strategy, IOperator operator, String val) {
		this.operator = operator;
		this.strategy = strategy;
		this.val = val;
	}

	public void calculate(Stack<Double> stack) {
		strategy.calculate(val, operator, stack);
	}

}
