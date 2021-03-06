package testingFiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javaImplementation.StringCalculator6;

class StringCalculatorTest6 {

	@Test
	public void emptyString() {
		assertEquals(0,StringCalculator6.Add(""));
	}
	
	@Test
	public void singleValue() {
		assertEquals(1,StringCalculator6.Add("1"));
	}
	
	@Test
	public void doubleValue() {
		assertEquals(3,StringCalculator6.Add("1,2"));
	}
	
//	@Test    
//	public final void moreThanTwoValue() {
//		Assertions.assertThrows(RuntimeException.class, () -> StringCalculator6.Add("1,2,3"));
//	} 
	
	@Test
	public final void handleNewLine() {
		assertEquals(6,StringCalculator6.Add("1\n2,3"));
	}
	
	@Test
	public void shouldAcceptCustomDelimeter() {
		assertEquals(1+2,StringCalculator6.Add("//;\n1;2"));
	}
	
	@Test
	public final void throwExceptionWhenNegativeNumberOccured() {
		Assertions.assertThrows(RuntimeException.class, () -> StringCalculator6.Add("10,5,55,-1"));
	}
	
	@Test
	public final void multipleNegativeNumberShowExceptionMessage() {
		RuntimeException exception = null;
		try {
			StringCalculator6.Add("1,2,-5,-8,6,3");
		} catch (RuntimeException e) {
			exception = e;
		}
		Assert.assertNotNull(exception);
		Assert.assertEquals("Negatives not allowed: [-5, -8]", exception.getMessage());
	}


}
