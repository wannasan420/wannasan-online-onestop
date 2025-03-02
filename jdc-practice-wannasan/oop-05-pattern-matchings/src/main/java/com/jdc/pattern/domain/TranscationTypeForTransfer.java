package com.jdc.pattern.domain;

public record TranscationTypeForTransfer(
		String name,
		String transferFrom,
		String transferTo)implements TranscationType {

}
