package com.ciq.jpa;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","4");
		String join = String.join("-",list );
		System.out.println(join);
	}

}
