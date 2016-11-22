package calc.oper;

public class Add implements IBinaryOperator {

	private static Add st = new Add();

	private Add() {
	}

	public static Add getInstance() {
		return st;
	}

	public Double calculate(Double a, Double b) {
		return a + b;
	}

}
