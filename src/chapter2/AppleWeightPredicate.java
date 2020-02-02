package chapter2;

import chapter1.Apple;

public class AppleWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}
