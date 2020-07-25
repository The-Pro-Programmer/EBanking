package com.intl.wo.services;

import java.util.ArrayList;
import java.util.List;

import com.intl.wo.beans.Account;
import com.intl.wo.dao.AccountsDAO;

public interface AccountServices {

	ArrayList<Account> retrieveAccountList();
	Account addAccount(Account account);
	void addAccounts(List<Account> accounts);
	
	AccountsDAO accountsDAO = new AccountsDAO();
	
}
