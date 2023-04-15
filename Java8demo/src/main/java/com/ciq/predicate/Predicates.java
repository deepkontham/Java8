package com.ciq.predicate;

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<Integer> p=I->(I>10);
//		System.out.println(p.test(20));
		
		
		Predicate<Integer>p1=I->(I<20);
//		  boolean result = p.and(p1).test(15);
//	        System.out.println(result);	}//true
		
	  boolean result = p.and(p1).negate().test(15);
      System.out.println(result);	//false
      }
	

}
