package com.jdc.demo;

public class Car {

	private String type;
	
	public Car() {
		this.type = "Car";
	}
	
	public Car(String type) {
		super();
		this.type = type;
	}
	public void drive() {
		System.out.printf("%s is driving.%n",type);
	}
	public void park() {
		System.out.printf("%s is parking.%n",type);
	}
	
}
