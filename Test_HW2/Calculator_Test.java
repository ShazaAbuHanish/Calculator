import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Calculator_Test {

	@Test
	public void calculatorTest() {
		assertEquals("Error in Addition operation()",3,Software.Calculator.add(1, 2));
		assertEquals("Error in Addition operation()",-3,Software.Calculator.add(-1, -2));
		assertEquals("Error in Addition operation()",9,Software.Calculator.add(9, 0));
	
	}
	
	

}
