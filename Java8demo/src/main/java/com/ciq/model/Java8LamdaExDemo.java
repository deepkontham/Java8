package com.ciq.model;

public class Java8LamdaExDemo {
	public static void main(String[] args) {
		
	//Lamda Expression syntax () ->{}
	
	Java8demo j=()->{
		return "hello deepu";
		
	};
	System.out.println(j.samdemo());
	
	Java8demo j1=()->{
		return "hello chinnu";
		
	};
 System.out.println(j1.samdemo() );
 
 Welcome w=(name)->{
	 System.out.println("hello"+name);
	 
 };
 w.Samlamda("welcome to job");
}
	
	
}
