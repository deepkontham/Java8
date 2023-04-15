package com.ciq.model;

import java.util.function.Consumer;

public class Consumerintrf {
	public static void main(String[] args) {
		Consumer<String> cs=str->System.out.print(str);
		cs.accept("chinnu");	
		}

}
