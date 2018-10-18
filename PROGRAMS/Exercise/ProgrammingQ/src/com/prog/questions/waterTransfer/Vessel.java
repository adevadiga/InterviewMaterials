package com.prog.questions.waterTransfer;

public class Vessel {

	private int capacity;
	private int current;
	
	Vessel(int capacity){
		this.capacity = capacity;
		this.current = 0;
	}
	// The main function to fill one litre in this vessel. Capacity 
	// of V2 must be greater than this vessel and two capacities 
	// must be coprime
	void makeOneLiter(Vessel v2){
		
		/*if (gcd(capacity, V2.capacity) != 1)
	        return;*/
		while(current != 1){
			
			if (current == 0)
	            current = capacity;
			
			System.out.println(" Vessel 1 = "+current+"  Vessel 2 = "+v2.current);
			
			// Transfer water from V1 to V2 and reduce current of V1 by
	        //  the amount equal to transferred water
	        current = current - v2.transfer(current);
			
		}
		
		System.out.println(" Vessel 1 = "+current+"  Vessel 2 = "+v2.current);
		
	}
	
	int transfer(int amount){
		if(amount + current < capacity){
			current += amount;
			return amount;
		}
		
		int transferred = capacity - current;
		current = 0;
		return transferred;
		
	}
}
