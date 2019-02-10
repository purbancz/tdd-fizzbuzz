package fizzbuzzmechanics;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {


	public String[] fizzBuzzed() {
		Stream<String> stringStreamTest = IntStream.rangeClosed(1, 100)
				.mapToObj(i -> String.valueOf(i))
				.map(i -> Integer.parseInt(i) % 15 == 0 ? "FizzBuzz" :
					Integer.parseInt(i) % 5 == 0 ? "Buzz" :
					Integer.parseInt(i) % 3 == 0 ? "Fizz" : i);
		return stringStreamTest.toArray(size -> new String[size]);
	}

	public void printFizzBuzzed() {
		for (String s : fizzBuzzed()) {
			System.out.println(s);
		}
	}

}
