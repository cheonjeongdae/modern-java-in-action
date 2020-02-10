package chapter5;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class ArrayStreamTest {

	@Test
	void test() {
		String[] arrayOfWords = {"Goodbye", "World"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		streamOfWords.forEach( str -> {
			System.out.println(str);
		});
	}
	
	@Test
	void flatMap() {
		List<String> words = Arrays.asList("Hello", "World");
		List<String> uiqueCharacters = words.stream()
											.map(word -> word.split(""))
											.flatMap(Arrays::stream)
											.distinct()
											.collect(toList());
	}

}
