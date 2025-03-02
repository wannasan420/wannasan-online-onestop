package com.jdc.pattern.domain;

public sealed abstract class AbstractTranscation implements Transcation permits AgentTranscation, ConsumerTranscation{

	private long id;
	private String name;
	
	public AbstractTranscation(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public long getTranscationId() {		
		return id;
	}
	
	@Override
	public String getTranscationName() {
		return name;
	}
}
