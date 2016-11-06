package com.bank.bean;

public class Account {

	private Long number;
	private float balance;
	
	public Account(Long number, float balance) {
		this.number = number;
		this.balance = balance;
	}
	
	public void credit(float amount) {
		balance += amount;
	}
	
	public void debit(float amount) {
		balance -= amount;
	}
	
	public Long getNumber() {
		return number;
	}	
	
	public float getBalance() {
		return balance;
	}
	
	
}
