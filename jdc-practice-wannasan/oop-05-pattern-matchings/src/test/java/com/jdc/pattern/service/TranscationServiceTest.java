package com.jdc.pattern.service;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.pattern.domain.AgentTranscation;
import com.jdc.pattern.domain.ConsumerTranscation;

public class TranscationServiceTest {

	private TranscationService service;
	
	@BeforeEach
	void inItEach() {
		service = new TranscationService();
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,Transfer,Aung Aung,10000",
		"2,Bill Payment,Nilar,1500"
	})
	void test_consumer(long id, String name, String consumerName, BigDecimal amount) {
		
		var input = new ConsumerTranscation(id,name,consumerName,amount);
		service.show(input);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,Cash Out,196 Store,10000",
		"2,Cash In,Ngwe La Min,1500"
	})
	void test_agent(long id, String name, String agentName, BigDecimal amount) {
		
		var input = new AgentTranscation(id,name,agentName,amount);
		service.show(input);
	}
}
