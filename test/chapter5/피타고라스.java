package chapter5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class 피타고라스 {

	@Test
	void test() {
		Stream<int[]> numbers = 
		IntStream.rangeClosed(1, 100)
		.boxed()
		.flatMap(a -> IntStream.rangeClosed(a, 100)
								.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
								.mapToObj(b -> new int[] {a, b, (int) Math.sqrt(a * a + b * b)})
				);
		
		numbers.forEach(arr -> System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] ));
	}

}
