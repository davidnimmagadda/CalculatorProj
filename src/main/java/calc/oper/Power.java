package calc.oper;

public class Power implements IBinaryOperator {

	private static Power st = new Power();

	private Power() {
	}

	public static Power getInstance() {
		return st;
	}

	@Override
	public Double calculate(Double a, Double b) {
		return Math.pow(a, b);
	}

}
