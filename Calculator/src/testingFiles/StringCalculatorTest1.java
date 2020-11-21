package testingFiles;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javaImplementation.StringCalculator1;

class StringCalculatorTest1 {

	@Test
	void emptyString() {
		StringCalculator1 empty = new StringCalculator1();
		int output = empty.Add("");
		assertEquals(0, output);	
	}
	@Test
	void forSingleValue() {
		StringCalculator1 single = new StringCalculator1();
		int output = single.Add("1");
		assertEquals(1, output);	
	}
	@Test
	void forDoubleValue() {
		StringCalculator1 dual = new StringCalculator1();
		int output = dual.Add("1,2");
		assertEquals(3, output);	
	}

}
