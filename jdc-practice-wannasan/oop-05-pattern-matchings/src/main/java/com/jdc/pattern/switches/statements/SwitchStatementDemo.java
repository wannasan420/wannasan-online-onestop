package com.jdc.pattern.switches.statements;

import com.jdc.pattern.switches.Rectangle;
import com.jdc.pattern.switches.Shape;
import com.jdc.pattern.switches.Square;
import com.jdc.pattern.switches.Triangle;

public class SwitchStatementDemo {

	public static void showAreaInstanceofTypePattern(Shape shape) {
		
		if(shape instanceof Square s) {
			
			System.out.println(s.base()*s.base());
			
		}else if(shape instanceof Rectangle s) {
			
			System.out.println(s.base()*s.height());
			
		}else if(shape instanceof Triangle s) {
			
			System.out.println(s.base() * s.height()/2);
		}
		
	}
	
	public static void showAreaInstanceofRecordPattern(Shape shape) {
		
		if(shape instanceof Square (var b)) {
			
			System.out.println(b * b);
			
		}else if(shape instanceof Rectangle (var b, var h)) {
			
			System.out.println(b * h);
			
		}else if(shape instanceof Triangle (var b, var h)) {
			
			System.out.println(b * h / 2);
		}
		
	}
	public static void showAreaSwitchTypePattern(Shape shape) {
		
		switch(shape) {
		
		case Square s -> System.out.println(s.base() * s.base());
		
		case Rectangle s -> System.out.println(s.base() * s.height());
		
		case Triangle s -> System.out.println(s.base() * s.height() / 2);
		
		default -> System.out.println("Invalid shape!");
		}
		
	}
	public static void showAreaSwitchRecordPattern(Shape shape) {
		
		switch(shape) {
		
		case Square (var b) -> System.out.println(b * b);
		
		case Rectangle (var b, var h) -> System.out.println(b * h);
		
		case Triangle (var b, var h) -> System.out.println(b * h / 2);
		
		default -> System.out.println("Invalid shape!");
		}
	}
		
}
