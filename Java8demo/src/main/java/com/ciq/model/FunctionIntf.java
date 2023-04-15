package com.ciq.model;

import java.util.function.Function;

public class FunctionIntf {
	public static void main(String[] args) {
		
	Function<String, String> lowertoUp=(str)->str.toUpperCase();
	String ap = lowertoUp.apply("pradeep");
	System.out.println(ap);
	
	
	Function<String, Integer> strcount=(str)->str.length();
	  Integer count = strcount.apply("chinnu");
	  System.out.println("count:"+count);
	
	}

}
