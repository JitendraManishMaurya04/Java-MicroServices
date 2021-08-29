package com.mauryaApp.pixlrPicApp.api.account.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping("/status/check")
	public String status() {
		return "Account Service Working";
	}

}
