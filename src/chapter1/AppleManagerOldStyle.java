package chapter1;

import java.util.ArrayList;
import java.util.List;

public class AppleManagerOldStyle {

	public static final String GREEN = "green";
	
	/**
	 * 녹색 애플
	 * @param inventory
	 * @return
	 */
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(GREEN.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	/**
	 * 무게가 150 이상인 애플
	 * @param inventory
	 * @return
	 */
	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(GREEN.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
