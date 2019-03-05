package test.java;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.java.FizzBuzz;

@RunWith(Parameterized.class)
public class FizzBuzzScndTest {
	enum Type {POSITIVE, NEGATIVE};
	private FizzBuzz fb;
	private int input;
    private String expectedResult;
	private Type type;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Type.POSITIVE, 3, "Fizz"},
                {Type.POSITIVE, 6, "Fizz"},
                {Type.POSITIVE, 9, "Fizz"},
                {Type.POSITIVE, 5, "Buzz"},
                {Type.POSITIVE, 10, "Buzz"},
                {Type.POSITIVE, 20, "Buzz"},
                {Type.POSITIVE, 15, "FizzBuzz"},
                {Type.POSITIVE, 30, "FizzBuzz"},
                {Type.POSITIVE, 45, "FizzBuzz"},
                {Type.POSITIVE, 2, "2"},
                {Type.POSITIVE, 4, "4"},
                {Type.POSITIVE, 8, "8"},
                {Type.NEGATIVE, 2, "Fizz"},
                {Type.NEGATIVE, 5, "Fizz"},
                {Type.NEGATIVE, 3, "Buzz"},
                {Type.NEGATIVE, 15, "Buzz"},
                {Type.NEGATIVE, 15, "Fizz"},
                {Type.NEGATIVE, 3, "FizzBuzz"},
                {Type.NEGATIVE, 5, "FizzBuzz"},
                {Type.NEGATIVE, 3, "3"},
                {Type.NEGATIVE, 5, "5"},
                {Type.NEGATIVE, 15, "15"},
        });
    }

	public FizzBuzzScndTest(Type type, int input, String expectedResult) {
		this.type = type;
		this.input = input;
		this.expectedResult = expectedResult;
		this.fb = new FizzBuzz();
	}
	
	
	//Note that index of an array starts with zero.
    
	@Test
    public void testPositive() {
		Assume.assumeTrue(type == Type.POSITIVE);
        Assert.assertEquals(expectedResult, fb.fizzBuzzed()[input-1]);
    }
	
	@Test
    public void testNegative() {
		Assume.assumeTrue(type == Type.NEGATIVE);
        Assert.assertNotEquals(expectedResult, fb.fizzBuzzed()[input-1]);
    }
	
}
    
    

