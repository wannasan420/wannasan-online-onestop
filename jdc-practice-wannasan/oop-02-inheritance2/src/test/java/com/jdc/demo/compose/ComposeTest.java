package com.jdc.demo.compose;

import org.junit.jupiter.api.Test;

public class ComposeTest{

	@Test
	void Test() {
		var adder = new AddApplication(new Calculator());
		adder.ShowAddResult(10, 15);
		
	}
}
