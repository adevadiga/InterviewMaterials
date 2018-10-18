package com.cp.cleancode;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionDataFormatter {

	private Throwable throwable;
	
	public ExceptionDataFormatter(Throwable throwable)
	{
		this.throwable = throwable;
	}
	
	public String getRootCauseMessage()
	{
		 StringBuilder message = new StringBuilder();
		 Throwable originalThrowable = getRootCauseException();
		 message.append("\n<OriginalException>\n");
		 message.append("<FileName>");
		 message.append(originalThrowable.getStackTrace()[0].getFileName());
		 message.append("</FileName>\n");
		 message.append("<LineNumber>");
		 message.append(originalThrowable.getStackTrace()[0].getLineNumber());
		 return message.toString();
	}
	
	private Throwable getRootCauseException()
	{
		Throwable cause;
		for(cause = throwable; cause.getCause() != null; cause = cause.getCause())
		;
		return cause;
	}
	
	private String getStackTraceString(Throwable throwable)
	{
		StringWriter stringWriter = new StringWriter();
		PrintWriter pw = new PrintWriter(stringWriter);
		throwable.printStackTrace(pw);
		return stringWriter.toString();
	}
}
 