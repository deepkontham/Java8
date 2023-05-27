package com.ciq.jpa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		String str="Pradeepkontham";
		
		 List<String> list = Arrays.stream(str.split("")).
				 collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
				 entrySet().stream().filter(x->x.getValue()>1).
				 map(Map.Entry::getKey).collect(Collectors.toList());
	 System.out.println(list);
	}
	

}
