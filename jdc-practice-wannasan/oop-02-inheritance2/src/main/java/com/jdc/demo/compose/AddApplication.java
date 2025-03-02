package com.jdc.demo.compose;

public class AddApplication {

	public Calculator cal;

	public AddApplication(Calculator cal) {
		super();
		this.cal = cal;
	}
	
	public void ShowAddResult(int a, int b) {
		
		var result = cal.add( a, b);
		
		System.out.printf("%s + %s = %s %n",a,b,result);
	}
}