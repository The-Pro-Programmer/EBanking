package com.intl.wo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.intl.wo.beans.Account;

@Service
public class AccountServicesImpl implements AccountServices {
	
	@Override
	public ArrayList<Account> retrieveAccountList() {
		ArrayList<Account> accounts = accountsDAO.retrieveAccounts();
		return accounts;
	}

	@Override
	public Account addAccount(Account account) {
		return accountsDAO.addAccount(account);
	}

	@Override
	public void addAccounts(List<Account> accounts) {
		for(Account record: accounts) {
			accountsDAO.addAccount(record);
		}
	}
	
	

	
}
