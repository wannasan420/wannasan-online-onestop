package com.jdc.exceptions.demo;

public class Class2 {

	Class3 instance;

	public Class2() {
	
		instance = new Class3();
	}
	
	public int devide(int a, int b) {
		
		System.out.println("Class 2 works");
		int value = instance.devide(a, b);
		
		System.out.println("Class 2 work ends");
		
		return value;
	}
}
