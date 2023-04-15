package com.ciq.model;

public class Jav8demoimpl implements Java8demo{

	public String samdemo() {
		return "Hello pradeep";
	}
	
	public static void main(String[] args) {
		Java8demo demo=new Jav8demoimpl();
		System.out.println(demo.samdemo()); 
	}
	

}
