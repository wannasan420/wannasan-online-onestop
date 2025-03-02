package com.jdc.pattern.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.pattern.switches.enums.CardValue;
import com.jdc.pattern.switches.enums.GameCard;
import com.jdc.pattern.switches.enums.GuardedPatternDemo;

public class GuardedPatternTest {

	@ParameterizedTest
	@CsvSource({
		"Heart, 10",
		"Heart, 1",
		"Spade, 13",
		"Spade, 1"
	})
	void test(GameCard card, int value) {
		
		var v1 = new CardValue<GameCard>(card, value);
		var result = GuardedPatternDemo.getLabel(v1);
		System.out.println(result);
	}
}
