package com.bank.impl;

import com.bank.bean.Account;
import com.bank.facade.IBank;
import com.bank.service.IAccountService;
import com.bank.service.impl.AccountServiceImpl;

public class BankImpl implements IBank {
	
	// To put in a transaction
	@Override
	public void transfer(float amount, Long origineAccountNumber, Long targetAccountNumber) {
		IAccountService accountService = AccountServiceImpl.getInstance();
		
		Account origineAccount = accountService.findByNumber(origineAccountNumber);
		origineAccount.debit(amount);
		accountService.saveAccount(origineAccount);
		
		Account targetAccount = accountService.findByNumber(targetAccountNumber);
		targetAccount.credit(amount);
		accountService.saveAccount(targetAccount);		
	}

	@Override
	public float getBalance(Long accountNumber) {
		IAccountService accountService = AccountServiceImpl.getInstance();
		
		Account account = accountService.findByNumber(accountNumber);
		
		return account.getBalance();
	}

}
