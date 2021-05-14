package com.test.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.crudoperation.dto.Account;
import com.test.crudoperation.service.AccountService;

@RestController
@RequestMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/all")
	public List<Account> list() {
	    return accountService.getAccounts();
	}
}
