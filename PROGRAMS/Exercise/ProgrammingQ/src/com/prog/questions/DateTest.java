package com.prog.questions;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest {
	
	public static void r(){
		   Timestamp convertedTimestamp = new Timestamp(1424686838000l);
		   DateFormat dateFormat = DateFormat.getDateInstance( DateFormat.MEDIUM, Locale.US);
		   dateFormat.setTimeZone( TimeZone.getDefault() );
		   System.out.println(dateFormat.format(convertedTimestamp));
		   
		   SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yy HH:mm");
		   dateFormat2.setTimeZone(TimeZone.getDefault());
		   System.out.println(dateFormat2.toLocalizedPattern());
	}

}
