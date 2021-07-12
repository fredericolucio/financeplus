package com.mycantec.financeplus.financeplus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycantec.financeplus.financeplus.model.Accounts;
import com.mycantec.financeplus.financeplus.repository.AccountsRepository;


@RestController
@RequestMapping("/api/account")
public class AccountsController {
	
	@Autowired
	private AccountsRepository accountrepository;
	
	@PostMapping
	public @ResponseBody Accounts newAccounts(@Valid Accounts account) {
		
		accountrepository.save(account);
		return account;
	}
	
	

}
