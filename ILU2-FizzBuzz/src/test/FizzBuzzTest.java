package test;

import fizzbuzz.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	void testFizz1() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	void testFizz2() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}

}
