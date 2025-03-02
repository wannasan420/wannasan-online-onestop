package com.jdc.pattern.service;

import com.jdc.pattern.domain.TranscationType;
import com.jdc.pattern.domain.TranscationTypeForCashOut;
import com.jdc.pattern.domain.TranscationTypeForTransfer;

public class TranscationTypeService {

	public void show(TranscationType type) {
		System.out.println("Transcation Type Information");
		
		System.out.printf("%-16s : %s%n","Type Name",type.name());
		
		if(type instanceof TranscationTypeForCashOut (var name,var consumer,var agent)){
			
			System.out.printf("%-16s : %s%n","Agent Name",agent);
			System.out.printf("%-16s : %s%n","Consumer Name",consumer);
		}
		
		if(type instanceof TranscationTypeForTransfer(var name,var from,var to)) {
			
			System.out.printf("%-16s : %s%n","From",from);
			System.out.printf("%-16s : %s%n","To",to);
		}
	}
	
}