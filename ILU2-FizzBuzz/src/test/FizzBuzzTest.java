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
	
	@Test
	void testFizzMultiples() {
		assertEquals(FizzBuzz.fizzbuzz(6), "fizz");
		assertEquals(FizzBuzz.fizzbuzz(10), "buzz");
		assertEquals(FizzBuzz.fizzbuzz(9), "fizz");
	}
	
	@Test
	void testMultiplesDouble() {
		assertEquals(FizzBuzz.fizzbuzz(15), "fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(30), "fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(45), "fizzbuzz");
		
	}

}
