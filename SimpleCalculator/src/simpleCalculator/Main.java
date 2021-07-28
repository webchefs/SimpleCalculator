package simpleCalculator;

import simpleCalculator.business.abstracts.CalculatorService;
import simpleCalculator.business.concretes.AdditionManager;
import simpleCalculator.business.concretes.SubtractionManager;
import simpleCalculator.entities.Operand;

public class Main {

	public static void main(String[] args) {
		
		Operand operand = new Operand(15, 3);
		
		CalculatorService calculatorServices[] = {
				new AdditionManager(),
				new SubtractionManager()};
		
		for (CalculatorService calculatorService : calculatorServices) {
			System.out.println(
					calculatorService.testMessage() +
					calculatorService.calculate(operand));
		}
		
		
	}
}