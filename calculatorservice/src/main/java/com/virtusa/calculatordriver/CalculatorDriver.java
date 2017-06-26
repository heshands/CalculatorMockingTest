package com.virtusa.calculatordriver;

import com.virtusa.calculatorservice.ICalculatorService;

public class CalculatorDriver {

	public int incrCalculator(ICalculatorService iCaclulatorService)
	{
		int answer = iCaclulatorService.add(20, 30);	
		answer = answer +1;
		return answer;
	}
}
