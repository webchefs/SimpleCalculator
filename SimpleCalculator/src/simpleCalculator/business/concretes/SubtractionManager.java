package simpleCalculator.business.concretes;

import simpleCalculator.business.abstracts.CalculatorService;
import simpleCalculator.entities.Operand;

public class SubtractionManager implements CalculatorService{

	@Override
	public double calculate(Operand operand) {
		return operand.getFirstNumber() - operand.getSecondNumber();
	}

	@Override
	public String message() {
		return "Fark: ";
	}

}
