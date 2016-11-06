package com.bank.service;

import com.bank.bean.Account;

public interface IAccountService {
	
	public Account findByNumber(Long number);
	
	public void saveAccount(Account account);

}
