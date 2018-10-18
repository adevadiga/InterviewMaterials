
public class KeyPadEff {

	String[] symbolMap = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	
	public void printWords(String digitsPressed){
		char[] output = new char[digitsPressed.length()];
		printAllWords(digitsPressed.toCharArray(), 0, output, digitsPressed.length());
	}
	public void printAllWords(char[] digits, int currentDigit, char[] output, int n){
		 // Base case, if current output word is prepared
		if(currentDigit == n){
			System.out.println(output);
			return;
		}
		
		//Try all 3 possible characters for current digit in digits[]
	    //and recur for remaining digits
		for(int i=0; i < symbolMap[ digits[currentDigit]-'0' ].length(); i++){
			output[currentDigit] = symbolMap[ digits[currentDigit]-'0' ].charAt(i);
			printAllWords(digits, currentDigit+1, output, n);
			
			if(digits[currentDigit] == 0 || digits[currentDigit] == 1 ){
				return;
			}
		}
	}
}
