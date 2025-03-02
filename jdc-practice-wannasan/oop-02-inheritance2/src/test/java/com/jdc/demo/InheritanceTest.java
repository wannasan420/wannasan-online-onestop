package com.jdc.demo;

import org.junit.jupiter.api.Test;

public class InheritanceTest {

	@Test
	void test() {
		System.out.println("Testing Car"); 
		var car = new Car();
		car.drive();
		car.park();
		
		System.out.println("==============");
		System.out.println("Testing truck car");
		var truckCar = new TruckCar();
		truckCar.drive();
		truckCar.park();
		truckCar.loading();
	}
}
