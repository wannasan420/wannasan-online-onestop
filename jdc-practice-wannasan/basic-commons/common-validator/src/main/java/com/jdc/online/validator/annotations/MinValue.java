package com.jdc.online.validator.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface MinValue {

	String message() default "Does't match minimum value.";
	int value();
}
