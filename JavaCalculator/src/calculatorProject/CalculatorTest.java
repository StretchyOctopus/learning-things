package calculatorProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public final void testAdd() {
		String[] test = new String[]{"add","1","2"};
		assertEquals(Calculator.add(test), 3);
	}
	
	@Test
	public final void testAdd2() {
		String[] test = new String[]{"add","1","2","456"};
		assertEquals(Calculator.add(test), 459);
	}
	
	@Test
	public final void testMultiply() {
		String[] test = new String[]{"multiply","3","2"};
		assertEquals(Calculator.multiply(test), 6);		
	}
	
	@Test
	public final void testMultiply2() {
		String[] test = new String[]{"multiply","3","2","4"};
		assertEquals(Calculator.multiply(test), 24);		
	}

	@Test
	public final void testSubtract() {
		String[] test = new String[]{"subtract","3","2"};
		assertEquals(Calculator.subtract(test), 1);		
	}

	@Test
	public final void testCheckInput() {
		String[] test = new String[]{"subtract","3","2"};
		assertEquals(Calculator.checkInput(test), true);		
	}

	@Test
	public final void testCheckInputValid() {
		String[] test = new String[]{"anythinghere","3","2"};
		assertEquals(Calculator.checkInput(test), true);		
	}
	
	@Test
	public final void testCheckInputInvalid() {
		String[] test = new String[]{"anythinghere","llama","2"};
		assertEquals(Calculator.checkInput(test), false);		
	}

}
