package com.intl.wo.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.intl.wo.beans.Account;

public class AccountsDAO {
	
	@Autowired
	AccountsRepository accountsRepository;

	public ArrayList<Account> retrieveAccounts(){
		ArrayList<Account> accounts = new ArrayList<>();
		accountsRepository
			.findAll()
			.forEach(record -> accounts.add(record));
		return accounts;
	}
	
	public Account addAccount(Account account) {
		return accountsRepository.save(account);
	}
	
}
