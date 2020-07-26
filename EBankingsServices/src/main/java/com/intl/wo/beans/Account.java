package com.intl.wo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Account {

	@Id
	@Column
	private String accountNo;
	@Column
	private String accountName;
	@Column
	private String availableNalance;
	@Column
	private String accountType;
	@Column
	private String creationDate;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAvailableNalance() {
		return availableNalance;
	}
	public void setAvailableNalance(String availableNalance) {
		this.availableNalance = availableNalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	public Account(String accountNo, String accountName, String availableNalance, String accountType,
			String creationDate) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.availableNalance = availableNalance;
		this.accountType = accountType;
		this.creationDate = creationDate;
	}
	
	public Account() {
		super();
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", availableNalance="
				+ availableNalance + ", accountType=" + accountType + ", creationDate=" + creationDate + "]";
	}
	
	
}
