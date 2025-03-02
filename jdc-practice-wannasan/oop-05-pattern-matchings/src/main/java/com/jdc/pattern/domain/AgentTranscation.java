package com.jdc.pattern.domain;

import java.math.BigDecimal;

public final class AgentTranscation extends AbstractTranscation{

	private String agentName;
	private BigDecimal amout;
	
	public AgentTranscation(long id, String name) {
		super(id, name);
		
	}
	
	public AgentTranscation(long id, String name, String agentName, BigDecimal amout) {
		super(id, name);
		this.agentName = agentName;
		this.amout = amout;
	}

	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public BigDecimal getAmout() {
		return amout;
	}
	public void setAmout(BigDecimal amout) {
		this.amout = amout;
	}
	
	

}
