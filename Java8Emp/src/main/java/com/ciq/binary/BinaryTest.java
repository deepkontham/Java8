package com.ciq.binary;

import java.util.function.BinaryOperator;

public class BinaryTest {
	public static void main(String[] args) {
		BinaryOperator<Integer> f = (t1, t2) -> t1 + t2;
		Integer arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer re = 0;
		for (Integer integer : arr) {
			re = f.apply(re, integer);

		}
		System.out.println("Result:" + re);
	}

}
