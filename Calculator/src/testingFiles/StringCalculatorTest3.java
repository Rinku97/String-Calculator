package testingFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javaImplementation.StringCalculator3;

class StringCalculatorTest3 {

	@Test
	public void emptyString() {
		StringCalculator3 test = new StringCalculator3();
		int output = test.Add("");
		assertEquals(0,output);
	}
	
	@Test
	public void singleValue() {
		StringCalculator3 test = new StringCalculator3();
		int output = test.Add("1");
		assertEquals(1,output);
	}
	
	@Test
	public void doubleValue() {
		StringCalculator3 test = new StringCalculator3();
		int output = test.Add("1,2");
		assertEquals(3,output);
	}
	
//	@Test
//	public final void moreThanTwoValue() {
//		StringCalculator3 test = new StringCalculator3();
//		Assertions.assertThrows(RuntimeException.class, () -> test.Add("1,2,3"));
//	} 
	
	@Test
	public final void handleNewLine() {
		StringCalculator3 test = new StringCalculator3();
		int output = test.Add("1\n2,3");
		assertEquals(6,output);
	}

}
