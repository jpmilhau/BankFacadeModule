package com.bank.factory;

import com.bank.facade.IBank;
import com.bank.impl.BankImpl;

public class BankFactory {

	public static IBank getBank() {
		return new BankImpl();
	}
}
