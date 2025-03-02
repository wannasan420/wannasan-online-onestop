package com.jdc.exceptions.demo;

public class Application {

	public static void main(String[] args) {
		
		Class1 instance = new Class1();
		
		System.out.println("Main works");
		
		int value = instance.devide(10,0);
		
		System.out.printf("Value is %s %n",value);
		System.out.println("Main work ends");
	}
}
