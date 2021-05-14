package com.test.crudoperation.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.test.crudoperation.dto.Account;

@Component
public class AccountDaoStaticDataImpl implements AccountDao{
	private List<Account> topicList = new ArrayList<>(Arrays.asList(
            new Account("123456789", "Ramesh", 1000.00),
            new Account("846286246", "Suresh", 1050.50),
            new Account("959432375", "Girish", 1100.00)
    ));

	@Override
	public List<Account> getAccounts() {
		return topicList;
	}
	
	
}
