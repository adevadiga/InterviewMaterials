package com.cci.questions;

import java.util.Locale;
import java.util.TimeZone;

public class TimeZonePlay {

	public static void test(){
		TimeZone t = TimeZone.getTimeZone("GMT+8");
		String s = t.getDisplayName(Locale.US);
		System.out.println(s);
	}
}
