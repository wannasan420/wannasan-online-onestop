package com.jdc.pattern.switches.enums;

public class PatternMatchingEnums {

	public int getLevel(Card card) {
		
		return switch(card) {
		case GameCard.Heart, TarotCard.Angle -> 1;
		case GameCard.Spade, TarotCard.Saint -> 2;
		case GameCard.Diamond, TarotCard.People -> 3;
		case GameCard.Clover, TarotCard.Demon -> 4;
		
		default -> throw new IllegalArgumentException();
		};
	}
}
