package main.java;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
	
	public String[] fizzBuzzed() {
		Stream<Object> fizzBuzzedObjecttream = IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i)
				.map(i -> i % 15 == 0 ? "FizzBuzz" :
					i % 5 == 0 ? "Buzz" :
					i % 3 == 0 ? "Fizz" : i);
		return fizzBuzzedObjecttream.map(Object::toString).toArray(size -> new String[size]);
	}

	public void printFizzBuzzed() {
		for (String s : fizzBuzzed()) {
			System.out.println(s);
		}
	}

}
