package com.bptn.course._19_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {

	Calculator calc;

	@BeforeAll
	void initialize() {
		calc = new Calculator();
	}
	
	@BeforeEach
	void beforeEachTest() {
		
		System.out.println("BeforeEach: Executed before each test.");
	}

	@Test
	void testFindMax() {

		int max = calc.findMax(new int[] { 1, 3, 4, 2 });

		int expected = 4;

		Assertions.assertEquals(expected, max, "the output was incorrect");

		max = calc.findMax(new int[] { 10, 13, 41, 20 });

		expected = 41;

		Assertions.assertEquals(expected, max, "the output was incorrect");
	}

	@Test
	void testFindMaxNegative() {

		int max = calc.findMax(new int[] { -12, -1, -3, -4, -2 });

		int expected = -1;

		Assertions.assertEquals(expected, max, "the output was incorrect");

		max = calc.findMax(new int[] { -22, -13, -10, -3, -7 });

		expected = -3;

		Assertions.assertEquals(expected, max, "the output was incorrect");
	}

}
