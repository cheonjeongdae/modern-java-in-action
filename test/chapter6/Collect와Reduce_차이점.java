package chapter6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class Collect와Reduce_차이점 {

	@Test
	void test() {
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
		
		List<Integer> numbers = stream.reduce(
				new ArrayList<Integer>(),
				(List<Integer> l, Integer e) -> {
					System.out.println("e = " + e);
					l.add(e);
					return l;
				},
				(List<Integer> l1, List<Integer> l2) -> {
					System.out.println("combiner was called");
					l1.addAll(l2);
					return l1;
				});
		
		System.out.println(numbers);
	}

}
