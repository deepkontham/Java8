package com.ciq.jpa;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {
	public static void main(String[] args) {
		int []number= {2,3,32,43,23,45,76,96,83};
		Integer integer = Arrays.stream(number).boxed().
				sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}

}
