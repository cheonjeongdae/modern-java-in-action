package chapter5;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


class Quiz5_2Test {

	@Test
	void test() {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5);
		
		List<Integer> squareList = numbers.stream()
									.map(value -> value * value)
									.collect(toList());
	}
	
	@Test
	void 문제2() {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(4, 5);
		
		List<int[]> pairs = numbers.stream()
									.flatMap( i -> numbers2.stream().map(j -> new int[] {i, j}))
									.collect(toList());
	}
	
	@Test
	void 문제3() {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(4, 5);
		
		List<int[]> pairs = numbers.stream()
									.flatMap( i -> numbers2.stream()
											.filter(j -> (i + j) % 3 == 0)
											.map(j -> new int[] {i, j})
									)
									.collect(toList());
	}

}
