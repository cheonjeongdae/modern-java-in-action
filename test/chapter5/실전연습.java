package chapter5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.comparing;

import org.junit.jupiter.api.Test;

class 실전연습 {

	Trader raoul = new Trader("Raoul", "Cambridge");
	Trader mario = new Trader("Mario", "Milan");
	Trader alan = new Trader("Alan", "Cambridge");
	Trader brian = new Trader("Brian", "Cambridge");
	
	List<Transaction> transactions = Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
	);
	
	
	@Test
	void test_2011년_트랜잭션_오름차순() {
		List<Transaction> search2011Transactions = transactions.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(comparing(Transaction::getValue))
			.collect(toList());
	}
	
	@Test
	void 거래자_근무도시_중복없이() {
		List<String> cities = transactions.stream()
			.map(t -> t.getTrader().getCity())
			.distinct()	
			.collect(toList());
	}

	@Test
	void 케임브리지_모든거래자_이름순정렬() {
		List<Trader> traders = transactions.stream()
			.map(Transaction::getTrader)
			.filter(t -> t.getCity().equals("Cambridge"))
			.distinct()
			.sorted(comparing(Trader::getName))
			.collect(toList());
	}
	
	@Test
	void 최대값() {
		Optional<Transaction> maxTransaction = transactions.stream()
			.reduce( (t1, t2) -> t1.getValue() > t2.getValue() ? t1 : t2 );
		
		maxTransaction.ifPresent( t -> System.err.println(t.getValue()));
	}
	
	@Test
	void 최소값() {
		Optional<Integer> minValue = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer::max);
		
		System.out.println(minValue);
	}
}
