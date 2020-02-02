package chapter2;

import chapter1.Apple;

public class AppleWeightJudgePrintPredicate implements ApplePrintPredicate {

	@Override
	public void toString(Apple apple) {
		if(apple.getWeight() > 150) {
			System.out.println("heavy");
		} else {
			System.out.println("light");
		}
	}
}
