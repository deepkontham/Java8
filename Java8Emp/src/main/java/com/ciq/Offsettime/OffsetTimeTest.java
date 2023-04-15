package com.ciq.Offsettime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class OffsetTimeTest {
	public static void main(String[] args) {
		
	LocalDateTime l=LocalDateTime.now();
	System.out.println(l);
	
	OffsetDateTime d=OffsetDateTime.now();
	System.out.println(d);

}
}
