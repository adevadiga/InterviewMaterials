import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KeyPad {

	private Map<Integer, List<Character>> keySymbols = new HashMap<Integer, List<Character>>();
	public KeyPad(){
		keySymbols.put(1, new ArrayList<Character>());
		keySymbols.put(2, Arrays.asList('A', 'B', 'C'));
		keySymbols.put(3, Arrays.asList('D', 'E', 'F'));
		keySymbols.put(4, Arrays.asList('G', 'H', 'I'));
		keySymbols.put(5, Arrays.asList('J', 'K', 'L'));
		keySymbols.put(6, Arrays.asList('M', 'N', 'O'));
		keySymbols.put(7, Arrays.asList('P', 'Q', 'R', 'S'));
		keySymbols.put(8, Arrays.asList('T', 'U', 'V'));
		keySymbols.put(9, Arrays.asList('W', 'X', 'Y', 'Z'));
	}
	
	public void printAllWords(String digitsPressed){
		int len = digitsPressed.length();
		
		List<StringBuffer> words = new ArrayList<StringBuffer>();
		//First fill the list with first char
		List<Character> firstChars = keySymbols.get(digitsPressed.charAt(0)-'0');
		for(Character ch:firstChars){
			StringBuffer str = new StringBuffer(new String(new char[]{ch}));
			words.add(new StringBuffer(str));
		}
		//For each rest of chars
		int i = 1;
		while(i < len){
			firstChars = keySymbols.get(digitsPressed.charAt(i)-'0');
			//Get the values from the list
			//FOr each of firstChars append to the value of list and put back again in list
			StringBuffer[] processedWords = new StringBuffer[words.size()];
			int k=0;
			for(StringBuffer w:words ){
				processedWords[k++]=w;
			}
			for(Character ch:firstChars){
				for(StringBuffer w:processedWords){
					StringBuffer newWord = new StringBuffer(w);
					newWord.append(new StringBuffer(new String(new char[]{ch})));
					words.add(newWord);
				}
			}
			
			i++;
		}
		
		for(StringBuffer w : words){
			if(w.length() == digitsPressed.length()){
				System.out.println(w);
			}
		}
		
		
		
	}
	
	public void printWords(String digits, int k){
		if(k >= digits.length()){
			return;
		}
		
	}
}
