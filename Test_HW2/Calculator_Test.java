import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Calculator_Test {

	@Test
	public void calculatorTest() {
		assertEquals("Error in Addition operation()",3,Software.Calculator.add(1, 2));
		assertEquals("Error in Addition operation()",-3,Software.Calculator.add(-1, -2));
		assertEquals("Error in Addition operation()",9,Software.Calculator.add(9, 0));
	
	}
	
	public void calculatorTestAddFail()
	{
		assertEquals("Error in Addition operation()",0,Software.Calculator.add(1, 2));
	}
	
	public void calculatorTestSubPass()
	{
		assertEquals("Error in Subtraction operation()",1,Software.Calculator.add(1, 2));
		assertEquals("Error in Subtraction operation()",-1,Software.Calculator.add(-1, -2));
		assertEquals("Error in Subtraction operation()",0,Software.Calculator.add(2, 1));
	
	}
	
	public void calculatorSubFail()
	{
		assertEquals("Error in Subtraction operation()",0,Software.Calculator.add(2, 1));
	}

}
