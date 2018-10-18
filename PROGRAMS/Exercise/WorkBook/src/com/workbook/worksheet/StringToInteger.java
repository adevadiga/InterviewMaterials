package com.workbook.worksheet;

public class StringToInteger {

	public static Integer stringToInteger(String numStr) throws Exception{
		if(numStr ==  null){
			throw new Exception("null");
		}
		int len = numStr.length();
		if(len == 0){
			throw new Exception("Empty String");
		}
		int num = 0;
		for(int i=0;i<len;i++){
			num = num*10 + numStr.charAt(i)-'0';
		}
		return num;
	}
	
	

	
	 public static int parseInt(String s) throws Exception {
	        return parseInt(s,10);
	    }
	
	
	
	public static int parseInt(String s, int radix)
            throws Exception
{
    if (s == null) {
        throw new NumberFormatException("null");
    }

    if (radix < Character.MIN_RADIX) {
        throw new NumberFormatException("radix " + radix +
                                        " less than Character.MIN_RADIX");
    }

    if (radix > Character.MAX_RADIX) {
        throw new NumberFormatException("radix " + radix +
                                        " greater than Character.MAX_RADIX");
    }

    int result = 0;
    boolean negative = false;
    int i = 0, len = s.length();
    int limit = -Integer.MAX_VALUE;
    int multmin;
    int digit;

    if (len > 0) {
        char firstChar = s.charAt(0);
        if (firstChar < '0') { // Possible leading "-"
            if (firstChar == '-') {
                negative = true;
                limit = Integer.MIN_VALUE;
            } else
            {
            	//throw NumberFormatException(s);
            }

            if (len == 1) // Cannot have lone "-"
            {
            	//throw NumberFormatException.forInputString(s);
            }
            i++;
        }
        multmin = limit / radix;
        while (i < len) {
            // Accumulating negatively avoids surprises near MAX_VALUE
            digit = Character.digit(s.charAt(i++),radix);
            if (digit < 0) {
            	throw new Exception("jjj");
                //throw NumberFormatException.forInputString(s);
            }
            if (result < multmin) {
            	throw new Exception("jjj");
                //throw NumberFormatException.forInputString(s);
            }
            result *= radix;
            if (result < limit + digit) {
            	throw new Exception("jjj");
                //throw NumberFormatException.forInputString(s);
            }
            result -= digit;
        }
    } else {
    	throw new Exception("jjj");
       // throw NumberFormatException.forInputString(s);
    }
    return negative ? result : -result;
}
}
