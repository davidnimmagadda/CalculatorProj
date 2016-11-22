package calc.oper;

public class Divide implements IBinaryOperator {

	private static Divide st = new Divide();

	private Divide() {
	}

	public static Divide getInstance() {
		return st;
	}

	@Override
	public Double calculate(Double a, Double b) {
		return a / b;
	}

}
