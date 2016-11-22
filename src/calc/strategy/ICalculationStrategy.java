package calc.strategy;

import java.util.Stack;

import calc.oper.IOperator;

public interface ICalculationStrategy {

	void calculate(String val, IOperator op, Stack<Double> stack);

}
