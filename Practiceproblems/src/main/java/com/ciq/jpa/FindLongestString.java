package com.ciq.jpa;

import java.util.Arrays;

public class FindLongestString {
public static void main(String[] args) {
	String [] str= {"java","techie","springboot","Microservices"};
	String string = Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).
			get();
  System.out.println(string);
}
}
