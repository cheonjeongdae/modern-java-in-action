package chapter4;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import chapter4.Dish.Type;

class DishTest {
	
	List<Dish> menu = Arrays.asList(
		new Dish("pork", false, 800, Type.MEAT),
		new Dish("beef", false, 700, Type.MEAT),
		new Dish("chicken", false, 400, Type.MEAT),
		new Dish("french", false, 530, Type.OTHER),
		new Dish("rice", true, 350, Type.OTHER),
		new Dish("season", true, 120, Type.OTHER),
		new Dish("pizza", true, 550, Type.OTHER),
		new Dish("prawns", false, 300, Type.FISH),
		new Dish("salmon", false, 450, Type.FISH)
		);

	@Test
	void test() {
		List<String> lowCaloricDishesNames = menu.stream()
				.filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(toList());
				
	}
	
	@Test
	void 퀴즈4_1() {
		List<String> lowCaloricDishesNames = menu.stream()
				.filter(d -> d.getCalories() > 300)
				.map(Dish::getName)
				.collect(toList());
		System.out.println(lowCaloricDishesNames);		
	}
	
	@DisplayName("중간 연산 표시")
	@Test
	void 중간연산표시() {
		List<String> lowCaloricDishesNames = menu.stream()
				.filter(d -> {
					System.out.println("filtering : " + d.getName());
					return d.getCalories() < 400; })
				.sorted(comparing(Dish::getCalories))
				.map(dish -> {
					System.out.println("mapping : " + dish.getName());
					return dish.getName();
				})
				.collect(toList());
				
	}

}
