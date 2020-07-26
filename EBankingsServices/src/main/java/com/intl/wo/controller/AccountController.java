package com.intl.wo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intl.wo.beans.Account;

@RestController
public class AccountController extends BaseController{
	
	@GetMapping("/accountSummary")
	public ArrayList<Account> retrieveAccountList(){
		ArrayList<Account> accounts = new ArrayList<>();
		try {
			accounts = accountServices.retrieveAccountList();
		}catch(Exception e) {
			System.out.println(e);
		}
		return accounts;
	}
	
	@GetMapping("/initDummyAccounts")
	public String initDummyAccounts() {
		List<Account> accounts = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			Account record = new Account("000123456"+i , "My Acc"+i, i+"000", "SA" , "0"+i+"/02/1988");
			accounts.add(record);
		}
		accountServices.addAccounts(accounts);
		return "Inserted accounts: " + accounts.size();
	}
}
