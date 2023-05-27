package com.ciq.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartwith1 {
	public static void main(String[] args) {
		int[] n= {32,1,31,12,54,16};
		List<String> list = Arrays.stream(n).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(list);
	}

}
