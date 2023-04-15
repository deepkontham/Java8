package com.ciq.functional;

public interface FunctionIntf {
	public int Cal(int a,int b);
	
	default int hello(int a,int b) {
		return a+b;
	}
	
	static void welcome() {
		System.out.println("static method");
	}
	

}
