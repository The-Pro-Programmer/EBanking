package com.intl.wo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intl.wo.beans.Account;
import com.intl.wo.dao.AccountsRepository;

@Service
public class AccountServices {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	public ArrayList<Account> retrieveAccountList() {
		ArrayList<Account> accounts = new ArrayList<>(); 
		accountsRepository.findAll().forEach(record -> accounts.add(record));
		return accounts;
	}

	public Account addAccount(Account account) {
		return accountsRepository.save(account);
	}
	
	public Account editAccount(Account account) {
		return accountsRepository.save(account);
	}

	public void addAccounts(List<Account> accounts) {
		for(Account record: accounts) {
			accountsRepository.save(record);
		}
	}
	
	

	
}
