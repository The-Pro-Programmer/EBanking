package com.intl.wo.controller;

import com.intl.wo.services.AccountServices;
import com.intl.wo.services.AccountServicesImpl;

public class BaseController {

	AccountServices accountServices;
	
	BaseController(){
		accountServices = new AccountServicesImpl();
	}

	public AccountServices getAccountServices() {
		return accountServices;
	}

	public void setAccountServices(AccountServices accountServices) {
		this.accountServices = accountServices;
	}
	
	
}
