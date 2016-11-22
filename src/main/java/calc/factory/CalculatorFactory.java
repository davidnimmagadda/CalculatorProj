package calc.factory;

import java.util.HashMap;
import java.util.Map;

import calc.oper.Add;
import calc.oper.Divide;
import calc.oper.IOperator;
import calc.oper.Multiply;
import calc.oper.Percentage;
import calc.oper.Power;
import calc.oper.Substract;
import calc.strategy.BinaryStrategy;
import calc.strategy.ICalculationStrategy;
import calc.strategy.NumberStrategy;
import calc.strategy.UnaryStrategy;

public class CalculatorFactory {
	Map<String, ICalculationStrategy> map = new HashMap<>();
	Map<String, IOperator> map2 = new HashMap<>();

	private static CalculatorFactory cal = new CalculatorFactory();

	private CalculatorFactory() {
		initMap();
	}

	public void initMap() {
		map.put("+", BinaryStrategy.getInstance());
		map2.put("+", Add.getInstance());
		map.put("-", BinaryStrategy.getInstance());
		map2.put("-", Substract.getInstance());
		map.put("*", BinaryStrategy.getInstance());
		map2.put("*", Multiply.getInstance());
		map.put("/", BinaryStrategy.getInstance());
		map2.put("/", Divide.getInstance());
		map.put("^", BinaryStrategy.getInstance());
		map2.put("^", Power.getInstance());
		map.put("%", UnaryStrategy.getInstance());
		map2.put("%", Percentage.getInstance());
	}

	public static CalculatorFactory getInstance() {
		return cal;
	}

	public Out getStuff(String val) {
		if (map.containsKey(val))
			return new Out(map.get(val), map2.get(val), val);
		else
			return new Out(NumberStrategy.getInstance(), null, val);
	}

}