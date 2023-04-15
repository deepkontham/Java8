package com.ciq.Date;

import java.time.MonthDay;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class DateTest {
	public static void main(String[] args) {
	 MonthDay m=MonthDay.now();
	 ValueRange r=m.range(ChronoField.MONTH_OF_YEAR);
	 System.out.println(r);
	 
	}

}
