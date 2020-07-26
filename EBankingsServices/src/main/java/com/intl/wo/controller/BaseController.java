package com.intl.wo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.intl.wo.services.AccountServices;

public class BaseController {

	@Autowired
	AccountServices accountServices;
	
	BaseController(){
		
	}

	public AccountServices getAccountServices() {
		return accountServices;
	}

	public void setAccountServices(AccountServices accountServices) {
		this.accountServices = accountServices;
	}
	
	
}
