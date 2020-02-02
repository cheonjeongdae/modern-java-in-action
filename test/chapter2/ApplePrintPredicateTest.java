package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import chapter1.Apple;

class ApplePrintPredicateTest {
	
	private List<Apple> getApples() {
		
		List<Apple> list = new ArrayList<>();
		list.add(new Apple("green", 100));
		list.add(new Apple("green", 50));
		list.add(new Apple("green", 300));
		return list;
	}
		
	@Test
	void test() {
		AppleManager.filterPrintApples(getApples(), new AppleWeightPrintPredicate());
		AppleManager.filterPrintApples(getApples(), new AppleWeightJudgePrintPredicate());
		
	}

}
