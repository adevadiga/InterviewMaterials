package com.workbook.worksheet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumRepeatedWordsFromFile {

	public static void readWords(String fileName){
		
		FileReader fr;
		Map<String, Integer> words =new HashMap<String, Integer>();
		try {
			fr = new FileReader(new File(fileName));
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null){
				String[] wordsPerLine = line.split("\\ ");
				for(String word:wordsPerLine){
				words.put(word, words.get(word) == null?1: words.get(word)+1);	
				}
				
			}
			
			/*char[] buffer = new char[1024];
			while(br.read(buffer) != -1){
				StringBuffer word = new StringBuffer();
				for(int i=0; i<buffer.length;i++){
					if(buffer[i] != ' '){
						word.append(buffer[i]);
						continue;
					}
					words.put(word.toString(),words.get(word) == null?1: words.get(word)+1);
					word = new StringBuffer();
				}
			}*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			
		}
		finally{
//			br.close();
//			fr.close();
		}
		int maxCount = 0; List<String> maxWords = new ArrayList<String>();
		for(Entry<String, Integer> w : words.entrySet()){
			if(w.getValue() > maxCount){
				maxCount = w.getValue();
				maxWords.add(w.getKey());
			}
			//System.out.println(w.getKey()+" "+w.getValue());
		}
		for(String maxWord:maxWords){
			System.out.println(maxWord);
		}
		
		
	}
}
