package com.absurd.thread;

public class Transaction {

	private Account fromAccount;
	private Account toAccount;
	private Integer amount;
	
	public Transaction(Account fromAccount, Account toAccount, Integer amount){
	  this.fromAccount  = fromAccount;
	  this.toAccount = toAccount;
	  this.amount = amount;
	}

	public Account getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public boolean carryOutTransaction(){
		boolean valid = false;
		fromAccount.decrement(amount);
		toAccount.increment(amount);
		return true;
		
	}
}
