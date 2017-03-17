package com.temp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //on class level
public @interface FieldDetails {

	public enum DataType{
		ASCII, Hexadecimal, IEEE754Float, Hex, UnsignedLongInteger
	}
	
	int sno();
	String paramName();
	int noOfBytes();
	DataType dataType();
	String remarks() default "";
}
