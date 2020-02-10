package chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import chapter4.Dish;
import chapter4.Dish.Type;

class DishTest {
	
	List<Dish> menu = Arrays.asList(
		new Dish("seasonal fruit", true, 120, Type.OTHER),
		new Dish("prawns", false, 300, Type.FISH),
		new Dish("rice", true, 350, Type.OTHER),
		new Dish("chicken", false, 400, Type.MEAT),
		new Dish("french fries", true, 530, Type.OTHER)
		);

	@Test
	void 정렬() {
		menu.stream()
			.sorted(comparing(Dish::getCalories))
			.forEach(System.out::println );
		
		System.out.println();		
	}
	
	@Test
	void takeWhile() {
		List<Dish> sliceMenu = menu.stream()
									.takeWhile(dish -> {
										System.out.println(" takeWhile --- " + dish);
										return dish.getCalories() < 320; 
									} )
									.collect(toList());
	}
	
	@Test
	void dropWhile() {
		List<Dish> sliceMenu2 = menu.stream()
									.dropWhile(dish -> {
										System.out.println(" dropWhile --- " + dish);
										return dish.getCalories() < 320; 
									} )
									.collect(toList());
		
		System.out.println(" 결과 : " + sliceMenu2);
	}
	
	@Test
	void skip() {
		List<Dish> dishes = menu.stream()
								.filter(dish -> dish.getCalories() > 300)
								.skip(2)
								.limit(3)
								.collect(toList());
		
		System.out.println(" dishes : " + dishes);
	}
}
