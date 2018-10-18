package com.lazarus.episode1;

public class GenerateSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen(new int[]{1,2,3,4});
	}
	
	public static void generate1(int[] a){
		
		for(int i=0;i<a.length;i++){
			StringBuilder b = new StringBuilder();
			b.append(a[i]);
			System.out.println(b);
			for(int j=i+1;j<a.length;j++){
				b.append(", "+a[j]);
				System.out.println(b);
			}
		}
	}
	
	
	public static void gen(int[] a){
		for(int i=0;i<a.length;i++){
			
			for(int j=i;j<a.length;j++){
				
				for(int k = i ; k<=j;k++){
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
