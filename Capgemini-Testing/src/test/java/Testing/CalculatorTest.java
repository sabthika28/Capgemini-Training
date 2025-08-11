package Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import SamplePrograms.Calculator;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void testAddition(){
		Assertions.assertEquals(11, calculator.add(5,6));
	}
	
	@Test
	public void testSubtraction(){
		Assertions.assertEquals(12, calculator.subtract(20,8));
	}

}
