package com.jdc.pattern.domain;

public record TranscationTypeForCashOut(
		String name,
		String consumerName,
		String agentShop)implements TranscationType {

}
