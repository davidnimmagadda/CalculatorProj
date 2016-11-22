package calc.oper;

public class Multiply implements IBinaryOperator {

	private static Multiply st = new Multiply();

	private Multiply() {
	}

	public static Multiply getInstance() {
		return st;
	}

	@Override
	public Double calculate(Double a, Double b) {
		return a * b;
	}

}
