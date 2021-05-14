package com.test.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crudoperation.dao.AccountDao;
import com.test.crudoperation.dto.Account;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;
	
	public List<Account> getAccounts() {
		return accountDao.getAccounts();
	}
}
