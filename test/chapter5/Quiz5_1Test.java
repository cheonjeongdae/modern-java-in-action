package chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import chapter4.Dish;
import chapter4.Dish.Type;

class Quiz5_1Test {
	
	List<Dish> menu = Arrays.asList(
		new Dish("seasonal fruit", true, 120, Type.OTHER),
		new Dish("prawns", false, 300, Type.FISH),
		new Dish("rice", true, 350, Type.OTHER),
		new Dish("chicken", false, 400, Type.MEAT),
		new Dish("french fries", true, 530, Type.OTHER)
		);

	@Test
	void 처음_두고기_요리_필터링() {
		List<Dish> meatList = menu.stream()
									.filter(dish -> Type.MEAT == dish.getType())
									.limit(2)
									.collect(toList());
		
		System.out.println(meatList);		
	}

}
