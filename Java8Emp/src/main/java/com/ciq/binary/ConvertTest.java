package com.ciq.binary;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConvertTest {
	public static void main(String[] args) {
		Convert convert=new Convert();
		BiFunction<Convert,String, String> f=(c,a)->c.tolower(a);
		System.out.println(f.apply(convert, "Hello"));
		
		//Method Reference
		BiFunction<Convert,String, String> f1=Convert::toUpper;
		
		System.out.println(f.apply(convert, "Hello"));
		
//		Function<String, String> test=String::toUpper;
				
	}

}
