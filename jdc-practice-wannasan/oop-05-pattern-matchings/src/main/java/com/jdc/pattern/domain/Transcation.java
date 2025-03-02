package com.jdc.pattern.domain;

public sealed interface Transcation permits AbstractTranscation{

	long getTranscationId();
	String getTranscationName();
}
