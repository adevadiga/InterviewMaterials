package com.anoop.algorithms.maths.transferwater;

public class Vessel {

	int capacity;
	int current;
	Vessel(int capacity){
		this.capacity = capacity;
		this.current = 0;
	}
	
	/*
	 * Capacity of V2 must be greater than this vessel and two capacities must be co-prime
	 */
	void make1Liter(Vessel v2){
		
		while(current != 1){
			if(current == 0){
				current = capacity;
			}
			System.out.println(" Vessel 1 = "+current+"  Vessel 2 = "+v2.current);
			current = current - v2.transfer(current);
		}
		
		System.out.println(" Vessel 1 = "+current+"  Vessel 2 = "+v2.current);
	}
	
	int transfer(int amount){
		if(current + amount < capacity){
			current += amount;
			return amount;
		}
		
		int transferred = capacity - current;
		current = 0;//Vessel is full Empty it
		return transferred;
	}
	
	public static void main(String[] args){
		Vessel v1 = new Vessel(3);
		Vessel v2 = new Vessel(7);
		v1.make1Liter(v2);
	}
}
