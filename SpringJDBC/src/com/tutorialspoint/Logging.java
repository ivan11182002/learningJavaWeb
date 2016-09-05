package com.tutorialspoint;

public class Logging {
	/** 
     * This is the method which I would like to execute
     * before a selected method execution.
     */
	public void beforeAdvice(){
		System.out.println("beforeAdvice...");
	}

	/** 
	 * This is the method which I would like to execute
	 * after a selected method execution.
	 */
	public void afterAdvice(){
		System.out.println("afterAdvice...");
	}

	/** 
	 * This is the method which I would like to execute
	 * when any method returns.
	 */
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning:" + retVal.toString() );
	}

	/**
	 * This is the method which I would like to execute
	 * if there is an exception raised.
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("afterThrowingAdvice: " + ex.toString());   
	}
}
