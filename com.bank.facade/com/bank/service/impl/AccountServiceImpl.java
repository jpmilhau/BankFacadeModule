package com.bank.service.impl;

import java.util.HashMap;

import com.bank.bean.Account;
import com.bank.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	
	// Singleton
	private static final AccountServiceImpl instance = new AccountServiceImpl();
	
	private AccountServiceImpl() {}
	
	public static AccountServiceImpl getInstance() {
		return instance;
	}
	
	// Database simulation
	private static final HashMap<Long, Account> accounts = new HashMap<Long, Account>();
	static {
		accounts.put(1L, new Account(1L, 500));
		accounts.put(2L, new Account(2L, 1000));
		accounts.put(3L, new Account(3L, 800));
	}
	
	@Override
	public Account findByNumber(Long number) {
		return accounts.get(number);
	}

	@Override
	public void saveAccount(Account account) {
		accounts.put(account.getNumber(), account);		
	}

}
