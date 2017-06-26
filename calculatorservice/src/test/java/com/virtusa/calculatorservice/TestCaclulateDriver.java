package com.virtusa.calculatorservice;

import org.junit.Test;

import com.virtusa.calculatordriver.CalculatorDriver;

import junit.framework.Assert;

import org.easymock.EasyMock;
public class TestCaclulateDriver {

	@Test
	public void testAdd(){
		ICalculatorService iCalculator = EasyMock.createNiceMock(ICalculatorService.class);
		EasyMock.expect(iCalculator.add(20, 30)).andReturn(50);
		EasyMock.replay(iCalculator);
		
		CalculatorDriver  calculatorDriver = new CalculatorDriver();
		int actual = calculatorDriver.incrCalculator(iCalculator);
		Assert.assertEquals(51, actual);
		
		
	}
}
