package chapter2;

import chapter1.Apple;
import static chapter2.Color.GREEN;

public class AppleColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return GREEN == Color.valueOf(apple.getColor());
	}
}
