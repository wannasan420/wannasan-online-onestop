package com.jdc.pattern.domain;

public sealed interface TranscationType
	permits TranscationTypeForCashOut, TranscationTypeForTransfer{

	String name();
}
