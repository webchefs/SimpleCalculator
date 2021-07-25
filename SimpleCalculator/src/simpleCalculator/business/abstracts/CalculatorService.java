package simpleCalculator.business.abstracts;

import simpleCalculator.entities.Operand;

public interface CalculatorService {
	double calculate(Operand operand);
	String message();
}
