package com.vishram.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayAsPerFrequency {

	static class FrequencyAndOrdinal{
		Integer frequency;
		Integer ordinal;
		FrequencyAndOrdinal(Integer frequency,int ordinal){
			this.frequency = frequency;
			this.ordinal = ordinal;
		}
	}
	static int compare(FrequencyAndOrdinal x, FrequencyAndOrdinal y){
		int result = x.frequency.compareTo(y.frequency);
		return result == 0? x.ordinal.compareTo(y.ordinal): result;
	}
	static void sortByFrequency(Integer[] a){
		//Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		final Map<Integer, FrequencyAndOrdinal> frequency = new HashMap<Integer, FrequencyAndOrdinal>();
		int tail = 0;
		for(int i=0;i<a.length;i++){
			/*Integer v = frequency.get(a[i]);
			frequency.put(a[i], null == v?1:v+1);*/
			FrequencyAndOrdinal v = frequency.get(a[i]);
			if(null != v){
				v.frequency++;
			}else{
				v = new FrequencyAndOrdinal(1, i);
				frequency.put(a[i],v);
			}
		}
		
		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return SortArrayAsPerFrequency.compare(frequency.get(o1), frequency.get(o2));
			}
			
		});
	
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
Integer[] a= {2,5,1,1,8,5,5,8,12,8,1,9};
		System.out.println(Arrays.toString(a));
		sortByFrequency(a);
	}

}
