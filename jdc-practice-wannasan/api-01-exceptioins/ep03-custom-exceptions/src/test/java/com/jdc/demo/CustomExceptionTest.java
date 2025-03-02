package com.jdc.demo;

import org.junit.jupiter.api.Test;

public class CustomExceptionTest {

	@Test
	void test() {
		
		var instance = new ReadFileAndShowLines();
		instance.readAndShow("test1.txt");
	}
}
