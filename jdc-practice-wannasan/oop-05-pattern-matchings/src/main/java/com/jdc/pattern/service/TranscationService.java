package com.jdc.pattern.service;

import com.jdc.pattern.domain.AgentTranscation;
import com.jdc.pattern.domain.ConsumerTranscation;
import com.jdc.pattern.domain.Transcation;

public class TranscationService {

	public void show(Transcation trx) {
		
		System.out.println("Transcation Information");
		System.out.printf("%-20s : %s%n","Transcation Id",trx.getTranscationId());
		System.out.printf("%-20s : %s%n","Transcaton Type",trx.getTranscationName());
		
		if(trx instanceof AgentTranscation agentTrx) {
			System.out.printf("%-20s : %s%n","Agent Name",agentTrx.getAgentName());
			System.out.printf("%-20s : %s%n","Amount",agentTrx.getAmout());
		}
		
		if(trx instanceof ConsumerTranscation consumerTrx) {
			System.out.printf("%-20s : %s%n","Consumer Name",consumerTrx.getConsumerName());
			System.out.printf("%-20s : %s%n","Amount",consumerTrx.getAmount());
		}
	}
}
