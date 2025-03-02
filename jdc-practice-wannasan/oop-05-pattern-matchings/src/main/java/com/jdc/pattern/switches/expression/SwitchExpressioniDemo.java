package com.jdc.pattern.switches.expression;

import com.jdc.pattern.switches.Rectangle;
import com.jdc.pattern.switches.Shape;
import com.jdc.pattern.switches.Square;
import com.jdc.pattern.switches.Triangle;

public class SwitchExpressioniDemo {

	public static double getAreaTypePattern(Shape shape) {
		
		return switch(shape) {
		
		case Square s -> s.base() * s.base();
		case Rectangle s -> s.base() * s.height();
		case Triangle s -> s.base() * s.height()/2;
		default -> throw new IllegalArgumentException();
		};
	}
	
	public static double getAreaRecordPattern(Shape shape) {
		
		return switch(shape) {
		
		case Square (var b) -> b * b;
		case Rectangle (var b, var h) -> b * h;
		case Triangle (var b, var h) -> b * h /2;
		default -> throw new IllegalArgumentException();
		};
	}
	
}
