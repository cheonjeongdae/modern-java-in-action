package chapter2;

import java.util.ArrayList;
import java.util.List;

import chapter1.Apple;

public class AppleManager {

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(Color.GREEN == Color.valueOf(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(color == Color.valueOf(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterPrintApples(List<Apple> inventory, ApplePrintPredicate p) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			p.toString(apple);
		}
		return result;
	}
}
