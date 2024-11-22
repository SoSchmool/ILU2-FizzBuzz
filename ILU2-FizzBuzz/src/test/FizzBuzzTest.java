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
	
	@Test
	void testFizz3() {
		assertEquals(FizzBuzz.fizzbuzz(3), "fizz");
	}
	
	@Test
	void testQuelquesValeurs() {
		assertEquals(FizzBuzz.fizzbuzz(4), "4");
		assertEquals(FizzBuzz.fizzbuzz(7), "7");
		assertEquals(FizzBuzz.fizzbuzz(400), "buzz");
	}
	
	@Test
	void testFizz5() {
		assertEquals(FizzBuzz.fizzbuzz(5), "buzz");
	}

}
