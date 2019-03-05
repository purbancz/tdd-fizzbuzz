package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.FizzBuzz;

public class FizzBuzzTest {
	private FizzBuzz fb;

	@Before
	public void createFizzBuzzorTheTest() {
		fb = new FizzBuzz();
	}
	
	//Note that index of an array starts with zero.

	@Test
	public void testEvery15thElement() {
		for (int i = 14; i < fb.fizzBuzzed().length; i+=15) {
				Assert.assertEquals("FizzBuzz", fb.fizzBuzzed()[i]);
		}
	}

	@Test
	public void testEvery5thElement() {
		for (int i = 4; i < fb.fizzBuzzed().length; i+=5) {
			if ((i + 1) % 15 != 0) {
				Assert.assertEquals("Buzz", fb.fizzBuzzed()[i]);
			}
		}
	}

	@Test
	public void testEvery3rdElement() {
		for (int i = 2; i < fb.fizzBuzzed().length; i+=3) {
			if ((i + 1) % 15 != 0) {
				Assert.assertEquals("Fizz", fb.fizzBuzzed()[i]);
			}
		}
	}
	
	@Test
	public void testAnyOtherElement() {
		for (int i = 0; i < fb.fizzBuzzed().length; i++) {
			if ((i + 1) % 3 != 0 && (i + 1) % 5 != 0) {
				Assert.assertEquals(String.valueOf(i+1), fb.fizzBuzzed()[i]);
			}
		}
	}

}
