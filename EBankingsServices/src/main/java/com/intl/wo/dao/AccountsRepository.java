package com.intl.wo.dao;

import org.springframework.data.repository.CrudRepository;

import com.intl.wo.beans.Account;

public interface AccountsRepository extends CrudRepository<Account, String> {

}
