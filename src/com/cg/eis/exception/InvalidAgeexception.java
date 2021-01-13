package com.cg.eis.exception;

public class InvalidAgeexception extends Exception {
	public InvalidAgeexception()
	{
		
	}
	public InvalidAgeexception(String age)
	{
		super(age);
	}

}