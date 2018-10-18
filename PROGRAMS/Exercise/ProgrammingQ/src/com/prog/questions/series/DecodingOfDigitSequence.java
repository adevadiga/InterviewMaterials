package com.prog.questions.series;

public class DecodingOfDigitSequence {
	
	public static void test(){
		String s = "123";
		System.out.println(countDecoding(new String("123"), 3));
		System.out.println();
		decode(new String(""), new String("123"));
		/*System.out.println(s.charAt(0)+'a'-1);
		int t = s.charAt(1)+'A'-'1';
		System.out.println(Character.toString((char) t));*/
	}


	static void decode(String prefix, String code){
		if(code.length() == 0){
			System.out.println(prefix);
			return;
		}
		
		if(code.charAt(0) == '0'){
			return;
		}
		
		//prefix += code.charAt(0)+'A'-'1';
		//DOnt do substring here on code. Since code need to be retained for below methods
		decode( prefix +  (char) (code.charAt(0)+'A'-'1') ,  code.substring(1));
		
		if(code.length() >= 2 && code.charAt(0) == '1'){
			decode(  prefix +  (char) ( 10 + code.charAt(0)+'A'-'1') ,  code.substring(2));
		}
		
		if(code.length() >= 2 && code.charAt(0)=='2' && code.charAt(1) <= '6'){
			decode(  prefix +  (char) ( 20 + code.charAt(0)+'A'-'1') ,  code.substring(2));
		}
	}

	static int countDecoding(String code, int n){
		if(n == 0 || n == 1){
			return 1;//count is 1 since n has one digit in it
		}
		
		int count = 0;
		if(code.charAt(n-1) > '0'){
			count+= countDecoding(code, n-1);
		}
		if(code.charAt(n-2) < '2' || (code.charAt(n-2) == '2' && code.charAt(n-1) <= '6')){
			count += countDecoding(code, n-2);
		}
		return count;
	}
}
