package com.jdc.pattern.switches.enums;

public record CardValue<T extends Card>(
		T card,
		int value
		) {

}
