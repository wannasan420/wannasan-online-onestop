package com.jdc.exceptions.demo;

public class Class1 {

	Class2 instance;
	
	public Class1(){
		instance = new Class2();
	}
	
	public int devide(int a, int b) {
		
		System.out.println("Class 1 works");
		try {
			int value = instance.devide(a, b);
			
			System.out.println("Class 1 work ends");
			return value;
			
		} catch(ArithmeticException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
