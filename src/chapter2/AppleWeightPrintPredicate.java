package chapter2;

import chapter1.Apple;

public class AppleWeightPrintPredicate implements ApplePrintPredicate {

	@Override
	public void toString(Apple apple) {
		System.out.println(apple.getWeight());
	}
}
