package chapter1;

import java.util.ArrayList;
import java.util.List;

public class AppleManager {

	public static final String GREEN = "green";
	
	public static boolean isGreenApple(Apple apple) {
		return GREEN.equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	
	public interface Predicate<T> {
		boolean test(T t);
	}
	
	static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
