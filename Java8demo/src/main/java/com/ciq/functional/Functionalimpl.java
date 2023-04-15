package com.ciq.functional;

public class Functionalimpl {
	public static void main(String[] args) {
		FunctionIntf f=(a,b)->a+b;
		FunctionIntf f1=(a,b)->a-b;
		
		System.out.println("sum:"+f.Cal(12, 20));
		System.out.println("sub:"+f1.Cal(14, 3));
		//static method
		FunctionIntf.welcome();
		
		//default method
		FunctionIntf def=(a,b)->a+b;
		System.out.println(def.Cal(12, 10));
		
	}

}
