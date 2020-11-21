package testingFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javaImplementation.StringCalculator5;

class StringCalculatorTest5 {

	@Test
	public void emptyString() {
		assertEquals(0,StringCalculator5.Add(""));
	}
	
	@Test
	public void singleValue() {
		assertEquals(1,StringCalculator5.Add("1"));
	}
	
	@Test
	public void doubleValue() {
		assertEquals(3,StringCalculator5.Add("1,2"));
	}
	
//	@Test    
//	public final void moreThanTwoValue() {
//		Assertions.assertThrows(RuntimeException.class, () -> StringCalculator5.Add("1,2,3"));
//	} 
	
	@Test
	public final void handleNewLine() {
		assertEquals(6,StringCalculator5.Add("1\n2,3"));
	}
	
	@Test
	public void shouldAcceptCustomDelimeter() {
		assertEquals(1+2,StringCalculator5.Add("//;\n1;2"));
	}
	
	@Test
	public final void throwExceptionWhenNegativeNumberOccured() {
		Assertions.assertThrows(RuntimeException.class, () -> StringCalculator5.Add("10,5,55,-1"));
	}
}
