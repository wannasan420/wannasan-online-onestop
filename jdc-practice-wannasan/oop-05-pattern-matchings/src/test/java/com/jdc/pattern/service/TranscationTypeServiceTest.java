package com.jdc.pattern.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.pattern.domain.TranscationTypeForCashOut;
import com.jdc.pattern.domain.TranscationTypeForTransfer;

public class TranscationTypeServiceTest {

	private TranscationTypeService service;
	
	@BeforeEach
	void inIt() {
		service = new TranscationTypeService();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Cash Out,Thidar,196 Store"
	})
	void test_cash_out(String name,
			String consumerName,
			String agentShop) {
		
		var input = new TranscationTypeForCashOut(name,consumerName,agentShop);
		service.show(input);
	}
	
	@ParameterizedTest
	@CsvSource({
		"Transfer,Thidar,Nilar"
	})
	void test_transfer(String name,
			String transferFrom,
			String transferTo) {
		var input = new TranscationTypeForTransfer(name,transferFrom,transferTo);
		service.show(input);
	}
}
