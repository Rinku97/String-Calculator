package testingFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javaImplementation.StringCalculator2;

class StringCalculatorTest2 {

	@Test
	public void emptyString() {
		StringCalculator2 test = new StringCalculator2();
		int output = test.Add("");
		assertEquals(0,output);
	}
	
	@Test
	public void singleValue() {
		StringCalculator2 test = new StringCalculator2();
		int output = test.Add("1");
		assertEquals(1,output);
	}
	
	@Test
	public void doubleValue() {
		StringCalculator2 test = new StringCalculator2();
		int output = test.Add("1,2");
		assertEquals(3,output);
	}
	
	@Test
	public final void moreThanTwoValue() {
		StringCalculator2 test = new StringCalculator2();
		Assertions.assertThrows(RuntimeException.class, () -> test.Add("1,2,3"));
	} 

}
