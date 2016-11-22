package calc.oper;

public class Substract implements IBinaryOperator {

	private static Substract st = new Substract();

	private Substract() {
	}

	public static Substract getInstance() {
		return st;
	}

	@Override
	public Double calculate(Double a, Double b) {
		return a - b;
	}

}
