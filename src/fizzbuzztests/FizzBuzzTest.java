package fizzbuzztests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fizzbuzzmechanics.FizzBuzz;

public class FizzBuzzTest {
	private FizzBuzz fb;

	@Before
	public void createFizzBuzzorTheTest() {
		fb = new FizzBuzz();
	}
	
	//Note that index of an array starts with zero.

	@Test
	public void testEvery15thElement() {
		for (int i = 14; i < fb.printFizzBuzzed().length; i+=15) {
				Assert.assertEquals("FizzBuzz", fb.printFizzBuzzed()[i]);
		}
	}

	@Test
	public void testEvery5thElement() {
		for (int i = 4; i < fb.printFizzBuzzed().length; i+=5) {
			if ((i + 1) % 15 != 0) {
				Assert.assertEquals("Buzz", fb.printFizzBuzzed()[i]);
			}
		}
	}

	@Test
	public void testEvery3rdElement() {
		for (int i = 2; i < fb.printFizzBuzzed().length; i+=3) {
			if ((i + 1) % 15 != 0) {
				Assert.assertEquals("Fizz", fb.printFizzBuzzed()[i]);
			}
		}
	}
	
	@Test
	public void testAnyOtherElement() {
		for (int i = 0; i < fb.printFizzBuzzed().length; i++) {
			if ((i + 1) % 3 != 0 && (i + 1) % 15 != 0 && (i + 1) % 5 != 0) {
				Assert.assertEquals(String.valueOf(i+1), fb.printFizzBuzzed()[i]);
			}
		}
	}

}
