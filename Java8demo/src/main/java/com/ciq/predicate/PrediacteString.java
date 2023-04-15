package com.ciq.predicate;

import java.util.function.Predicate;

public class PrediacteString {
	public static void main(String[] args) {
		Predicate<String> p=S->(S.length()>3);
		System.out.println(p.test("pradeep"));
	}

}
