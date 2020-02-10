package chapter5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import chapter4.Dish;
import chapter4.Dish.Type;

class 쇼트서킷테스트 {

	List<Dish> menu = Arrays.asList(
			new Dish("seasonal fruit", true, 120, Type.OTHER),
			new Dish("prawns", false, 300, Type.FISH),
			new Dish("rice", true, 350, Type.OTHER),
			new Dish("chicken", false, 400, Type.MEAT),
			new Dish("french fries", true, 530, Type.OTHER)
			);
	
	@Test
	void test() {
		menu.stream()
			.filter(Dish::isVegetarian)
			.findAny()
			.ifPresent(d -> System.out.println(d.getName()));
	}

}
