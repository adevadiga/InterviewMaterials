package com.twitter.interview;

public class ConfigLoadException extends RuntimeException{

	    public ConfigLoadException() {
	    	
	    }

	    public ConfigLoadException(String message) {
	        super(message);
	    }

	    public ConfigLoadException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public ConfigLoadException(Throwable cause) {
	        super(cause);
	    }

	    public ConfigLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	    }
}
