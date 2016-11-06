package com.bank.facade;

public interface IBank {

	void transfer(float amount, Long origineAccountNumber, Long targetAccountNumber);
	
	float getBalance(Long accountNumber);
}
