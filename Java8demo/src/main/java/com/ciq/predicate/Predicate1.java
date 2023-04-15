package com.ciq.predicate;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		int[]a= {2,3,4,5,13,21,2,7};
		Predicate<Integer> p=i-> i>10;
//		System.out.println(p.test(p,a));
	}

}
