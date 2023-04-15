package com.ciq.model;

public class Saminterfaceimpl {
	public static void main(String[] args) {
		Java8demo j=new Java8demo() {
			
			public String samdemo() {
				return "hello deepu";
			}
		};
		System.out.println(j.samdemo());
	
	Java8demo j1=new Java8demo() {
		
		public String samdemo() {
			return "hello chinnu";
		}
	};
  System.out.println(j1.samdemo());
}
}
