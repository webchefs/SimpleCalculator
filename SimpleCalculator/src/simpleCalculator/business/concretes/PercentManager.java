package simpleCalculator.business.concretes;

import simpleCalculator.business.abstracts.CalculatorService;
import simpleCalculator.entities.Operand;

public class PercentManager implements CalculatorService {

	@Override
	public double calculate(Operand operand) {
		return (operand.getSecondNumber() * (operand.getFirstNumber()/100));
	}

	@Override
	public String message() {
		return "Yüzde: ";
	}

}
