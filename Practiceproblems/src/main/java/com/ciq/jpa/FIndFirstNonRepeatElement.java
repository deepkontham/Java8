package com.ciq.jpa;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndFirstNonRepeatElement {
	
	public static void main(String[] args) {
		String str="pradeepkontham";
		String key = Arrays.stream(str.split("")).
				collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new, Collectors.counting())).entrySet().stream().
				filter(x->x.getValue()==1).findFirst().get().getKey();
     System.out.println(key);
	}

}
