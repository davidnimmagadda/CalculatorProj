package calc.oper;

public class Percentage implements IUnaryOperator {

	private static Percentage st = new Percentage();

	private Percentage() {
	}

	public static Percentage getInstance() {
		return st;
	}

	@Override
	public Double calculate(Double val) {
		return val / 100;
	}

}