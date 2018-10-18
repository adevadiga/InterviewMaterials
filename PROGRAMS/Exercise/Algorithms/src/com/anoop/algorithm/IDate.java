package com.anoop.algorithm;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class IDate {

	public static void g(){
		Calendar calendar = Calendar.getInstance();
		Timestamp now =new java.sql.Timestamp(calendar.getTime().getTime());
		DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.MEDIUM, Locale.getDefault());
		System.out.println(formatter);
	}
}
